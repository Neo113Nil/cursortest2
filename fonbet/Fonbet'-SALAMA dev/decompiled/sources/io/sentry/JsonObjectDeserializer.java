package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class JsonObjectDeserializer {
    private final ArrayList<Token> tokens = new ArrayList<>();

    /* renamed from: io.sentry.JsonObjectDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$vendor$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$io$sentry$vendor$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface NextValue {
        Object nextValue();
    }

    public interface Token {
        Object getValue();
    }

    public static final class TokenName implements Token {
        final String value;

        public TokenName(String str) {
            this.value = str;
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public Object getValue() {
            return this.value;
        }
    }

    public static final class TokenPrimitive implements Token {
        final Object value;

        public TokenPrimitive(Object obj) {
            this.value = obj;
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public Object getValue() {
            return this.value;
        }
    }

    private Token getCurrentToken() {
        if (this.tokens.isEmpty()) {
            return null;
        }
        return this.tokens.get(r0.size() - 1);
    }

    private boolean handleArrayOrMapEnd() {
        if (hasOneToken()) {
            return true;
        }
        Token currentToken = getCurrentToken();
        popCurrentToken();
        if (!(getCurrentToken() instanceof TokenName)) {
            if (!(getCurrentToken() instanceof TokenArray)) {
                return false;
            }
            TokenArray tokenArray = (TokenArray) getCurrentToken();
            if (currentToken == null || tokenArray == null) {
                return false;
            }
            tokenArray.value.add(currentToken.getValue());
            return false;
        }
        TokenName tokenName = (TokenName) getCurrentToken();
        popCurrentToken();
        TokenMap tokenMap = (TokenMap) getCurrentToken();
        if (tokenName == null || currentToken == null || tokenMap == null) {
            return false;
        }
        tokenMap.value.put(tokenName.value, currentToken.getValue());
        return false;
    }

    private boolean handlePrimitive(NextValue nextValue) {
        Object nextValue2 = nextValue.nextValue();
        if (getCurrentToken() == null && nextValue2 != null) {
            pushCurrentToken(new TokenPrimitive(nextValue2));
            return true;
        }
        if (getCurrentToken() instanceof TokenName) {
            TokenName tokenName = (TokenName) getCurrentToken();
            popCurrentToken();
            ((TokenMap) getCurrentToken()).value.put(tokenName.value, nextValue2);
            return false;
        }
        if (!(getCurrentToken() instanceof TokenArray)) {
            return false;
        }
        ((TokenArray) getCurrentToken()).value.add(nextValue2);
        return false;
    }

    private boolean hasOneToken() {
        return this.tokens.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$parse$2(JsonObjectReader jsonObjectReader) {
        return Boolean.valueOf(jsonObjectReader.nextBoolean());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$parse$3() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nextNumber, reason: merged with bridge method [inline-methods] */
    public Object lambda$parse$1(JsonObjectReader jsonObjectReader) {
        try {
            try {
                return Integer.valueOf(jsonObjectReader.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(jsonObjectReader.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(jsonObjectReader.nextLong());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void parse(final JsonObjectReader jsonObjectReader) {
        boolean z4;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$io$sentry$vendor$gson$stream$JsonToken[jsonObjectReader.peek().ordinal()]) {
            case 1:
                jsonObjectReader.beginArray();
                pushCurrentToken(new TokenArray(anonymousClass1));
                z4 = false;
                break;
            case 2:
                jsonObjectReader.endArray();
                z4 = handleArrayOrMapEnd();
                break;
            case 3:
                jsonObjectReader.beginObject();
                pushCurrentToken(new TokenMap(anonymousClass1));
                z4 = false;
                break;
            case 4:
                jsonObjectReader.endObject();
                z4 = handleArrayOrMapEnd();
                break;
            case 5:
                pushCurrentToken(new TokenName(jsonObjectReader.nextName()));
                z4 = false;
                break;
            case 6:
                final int i7 = 0;
                z4 = handlePrimitive(new NextValue() { // from class: io.sentry.d
                    @Override // io.sentry.JsonObjectDeserializer.NextValue
                    public final Object nextValue() {
                        Object nextString;
                        Object lambda$parse$2;
                        switch (i7) {
                            case 0:
                                nextString = jsonObjectReader.nextString();
                                return nextString;
                            default:
                                lambda$parse$2 = JsonObjectDeserializer.lambda$parse$2(jsonObjectReader);
                                return lambda$parse$2;
                        }
                    }
                });
                break;
            case 7:
                z4 = handlePrimitive(new e(0, this, jsonObjectReader));
                break;
            case 8:
                final int i8 = 1;
                z4 = handlePrimitive(new NextValue() { // from class: io.sentry.d
                    @Override // io.sentry.JsonObjectDeserializer.NextValue
                    public final Object nextValue() {
                        Object nextString;
                        Object lambda$parse$2;
                        switch (i8) {
                            case 0:
                                nextString = jsonObjectReader.nextString();
                                return nextString;
                            default:
                                lambda$parse$2 = JsonObjectDeserializer.lambda$parse$2(jsonObjectReader);
                                return lambda$parse$2;
                        }
                    }
                });
                break;
            case 9:
                jsonObjectReader.nextNull();
                z4 = handlePrimitive(new f(0));
                break;
            case 10:
                z4 = true;
                break;
            default:
                z4 = false;
                break;
        }
        if (z4) {
            return;
        }
        parse(jsonObjectReader);
    }

    private void popCurrentToken() {
        if (this.tokens.isEmpty()) {
            return;
        }
        this.tokens.remove(r0.size() - 1);
    }

    private void pushCurrentToken(Token token) {
        this.tokens.add(token);
    }

    public Object deserialize(JsonObjectReader jsonObjectReader) {
        parse(jsonObjectReader);
        Token currentToken = getCurrentToken();
        if (currentToken != null) {
            return currentToken.getValue();
        }
        return null;
    }

    public static final class TokenArray implements Token {
        final ArrayList<Object> value;

        private TokenArray() {
            this.value = new ArrayList<>();
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ TokenArray(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static final class TokenMap implements Token {
        final HashMap<String, Object> value;

        private TokenMap() {
            this.value = new HashMap<>();
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ TokenMap(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
