package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001:\u000e\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00060\nj\u0002`\u000b8\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00060\nj\u0002`\u000b8\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext;", "", "Lcom/izettle/android/serialization/JsonParser$Callbacks;", "p0", "", "p1", "<init>", "(Lcom/izettle/android/serialization/JsonParser$Callbacks;Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "Lcom/izettle/android/serialization/JsonParser$Callbacks;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "getHighSpeedVideoFpsRanges", "Ljava/lang/StringBuilder;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Ljava/util/Stack;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "Ljava/util/Stack;", "BeginArray", "BeginObject", "BuildingKey", "BuildingKeyDouble", "BuildingKeySingle", "BuildingStringValueDouble", "BuildingStringValueSingle", "BuildingValue", "ColonReceived", "Finalized", "Initial", "KeyBuilt", "State", "ValueBuilt"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class JsonParserContext {
    private final com.izettle.android.serialization.JsonParser.Callbacks Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    java.lang.StringBuilder getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    java.lang.StringBuilder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    java.util.Stack<com.izettle.android.serialization.JsonParserContext.State> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRanges;

    public JsonParserContext(com.izettle.android.serialization.JsonParser.Callbacks callbacks, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = callbacks;
        this.getHighSpeedVideoFpsRanges = str;
        java.util.Stack<com.izettle.android.serialization.JsonParserContext.State> stack = new java.util.Stack<>();
        stack.push(com.izettle.android.serialization.JsonParserContext.Initial.INSTANCE);
        this.getHighSpeedVideoSizes = stack;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.StringBuilder();
        this.getHighSpeedVideoFpsRangesFor = new java.lang.StringBuilder();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$State;", "", "", "endOfInputReached", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V", "parseChars", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)I"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface State {
        void endOfInputReached();

        void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position);

        int parseChars(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position);

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static int parseChars(com.izettle.android.serialization.JsonParserContext.State state, com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonParserContext, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                state.parseChar(jsonParserContext, str, i);
                return 1;
            }

            public static void endOfInputReached(com.izettle.android.serialization.JsonParserContext.State state) {
                throw new com.izettle.android.serialization.JsonParseException("Unexpected end of input reached");
            }

            public static void parseChar(com.izettle.android.serialization.JsonParserContext.State state, com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonParserContext, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$Initial;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Initial implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.Initial INSTANCE = new com.izettle.android.serialization.JsonParserContext.Initial();

        private Initial() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (kotlin.text.CharsKt.isWhitespace(charAt)) {
                return;
            }
            if (com.izettle.android.serialization.JsonToken.BEGIN_OBJECT.getValue() == charAt) {
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BeginObject.INSTANCE);
                context.Camera2StreamConfigurationMap.beginObject();
            } else {
                if (com.izettle.android.serialization.JsonToken.BEGIN_ARRAY.getValue() == charAt) {
                    context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BeginArray.INSTANCE);
                    context.Camera2StreamConfigurationMap.beginArray();
                    return;
                }
                throw new com.izettle.android.serialization.JsonParseException(charAt, position, context.getHighSpeedVideoFpsRanges, com.izettle.android.serialization.JsonToken.BEGIN_OBJECT.getValue(), com.izettle.android.serialization.JsonToken.BEGIN_ARRAY.getValue());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$BeginObject;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BeginObject implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.BeginObject INSTANCE = new com.izettle.android.serialization.JsonParserContext.BeginObject();

        private BeginObject() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (kotlin.text.CharsKt.isWhitespace(charAt)) {
                return;
            }
            if (com.izettle.android.serialization.JsonToken.DOUBLE_QUOTE.getValue() == charAt) {
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingKeyDouble.INSTANCE);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.SINGLE_QUOTE.getValue() == charAt) {
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingKeySingle.INSTANCE);
            } else if (com.izettle.android.serialization.JsonToken.END_OBJECT.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoFpsRangesFor(context);
            } else {
                context.getHighResolutionOutputSizeshNQ4ISI.append(charAt);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingKey.INSTANCE);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$BeginArray;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BeginArray implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.BeginArray INSTANCE = new com.izettle.android.serialization.JsonParserContext.BeginArray();

        private BeginArray() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (kotlin.text.CharsKt.isWhitespace(charAt)) {
                return;
            }
            if (com.izettle.android.serialization.JsonToken.DOUBLE_QUOTE.getValue() == charAt) {
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingStringValueDouble.INSTANCE);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.SINGLE_QUOTE.getValue() == charAt) {
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingStringValueSingle.INSTANCE);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.END_ARRAY.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.getHighResolutionOutputSizeshNQ4ISI(context);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.BEGIN_ARRAY.getValue() == charAt) {
                context.Camera2StreamConfigurationMap.beginArray();
                context.getHighSpeedVideoSizes.push(INSTANCE);
            } else if (com.izettle.android.serialization.JsonToken.BEGIN_OBJECT.getValue() == charAt) {
                context.Camera2StreamConfigurationMap.beginObject();
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BeginObject.INSTANCE);
            } else {
                context.getHighSpeedVideoFpsRangesFor.append(charAt);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingValue.INSTANCE);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$BuildingKey;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuildingKey implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.BuildingKey INSTANCE = new com.izettle.android.serialization.JsonParserContext.BuildingKey();

        private BuildingKey() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (kotlin.text.CharsKt.isWhitespace(charAt)) {
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.KeyBuilt.INSTANCE);
                com.izettle.android.serialization.JsonParserContext.Camera2StreamConfigurationMap(context);
            } else {
                if (com.izettle.android.serialization.JsonToken.COLON.getValue() == charAt) {
                    com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                    context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.ColonReceived.INSTANCE);
                    com.izettle.android.serialization.JsonParserContext.Camera2StreamConfigurationMap(context);
                    return;
                }
                context.getHighResolutionOutputSizeshNQ4ISI.append(charAt);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$BuildingKeySingle;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuildingKeySingle implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.BuildingKeySingle INSTANCE = new com.izettle.android.serialization.JsonParserContext.BuildingKeySingle();

        private BuildingKeySingle() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (charAt == com.izettle.android.serialization.JsonToken.SINGLE_QUOTE.getValue()) {
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.KeyBuilt.INSTANCE);
                com.izettle.android.serialization.JsonParserContext.Camera2StreamConfigurationMap(context);
                return;
            }
            context.getHighResolutionOutputSizeshNQ4ISI.append(charAt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$BuildingKeyDouble;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuildingKeyDouble implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.BuildingKeyDouble INSTANCE = new com.izettle.android.serialization.JsonParserContext.BuildingKeyDouble();

        private BuildingKeyDouble() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (charAt == com.izettle.android.serialization.JsonToken.DOUBLE_QUOTE.getValue()) {
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.KeyBuilt.INSTANCE);
                com.izettle.android.serialization.JsonParserContext.Camera2StreamConfigurationMap(context);
                return;
            }
            context.getHighResolutionOutputSizeshNQ4ISI.append(charAt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$KeyBuilt;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KeyBuilt implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.KeyBuilt INSTANCE = new com.izettle.android.serialization.JsonParserContext.KeyBuilt();

        private KeyBuilt() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (kotlin.text.CharsKt.isWhitespace(charAt)) {
                return;
            }
            if (com.izettle.android.serialization.JsonToken.COLON.getValue() != charAt) {
                throw new com.izettle.android.serialization.JsonParseException(charAt, position, context.getHighSpeedVideoFpsRanges, com.izettle.android.serialization.JsonToken.COLON.getValue());
            }
            com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
            context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.ColonReceived.INSTANCE);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$BuildingStringValueSingle;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "parseChars", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)I"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuildingStringValueSingle implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.BuildingStringValueSingle INSTANCE = new com.izettle.android.serialization.JsonParserContext.BuildingStringValueSingle();

        private BuildingStringValueSingle() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChar(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.Pair readEscapeCharacter;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (context.getHighSpeedVideoFpsRanges.charAt(position - 1) != '\\' && com.izettle.android.serialization.JsonToken.SINGLE_QUOTE.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoSizes(context);
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.ValueBuilt.INSTANCE);
            } else {
                if ('\\' == charAt) {
                    readEscapeCharacter = com.izettle.android.serialization.JsonParserKt.readEscapeCharacter(context.getHighSpeedVideoFpsRanges, position + 1);
                    char charValue = ((java.lang.Character) readEscapeCharacter.component1()).charValue();
                    int intValue = ((java.lang.Number) readEscapeCharacter.component2()).intValue();
                    context.getHighSpeedVideoFpsRangesFor.append(charValue);
                    return intValue + 1;
                }
                context.getHighSpeedVideoFpsRangesFor.append(charAt);
            }
            return 1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$BuildingStringValueDouble;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "parseChars", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)I"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuildingStringValueDouble implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.BuildingStringValueDouble INSTANCE = new com.izettle.android.serialization.JsonParserContext.BuildingStringValueDouble();

        private BuildingStringValueDouble() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChar(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.Pair readEscapeCharacter;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (context.getHighSpeedVideoFpsRanges.charAt(position - 1) != '\\' && com.izettle.android.serialization.JsonToken.DOUBLE_QUOTE.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoSizes(context);
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.ValueBuilt.INSTANCE);
            } else {
                if ('\\' == charAt) {
                    readEscapeCharacter = com.izettle.android.serialization.JsonParserKt.readEscapeCharacter(context.getHighSpeedVideoFpsRanges, position + 1);
                    char charValue = ((java.lang.Character) readEscapeCharacter.component1()).charValue();
                    int intValue = ((java.lang.Number) readEscapeCharacter.component2()).intValue();
                    context.getHighSpeedVideoFpsRangesFor.append(charValue);
                    return intValue + 1;
                }
                context.getHighSpeedVideoFpsRangesFor.append(charAt);
            }
            return 1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$BuildingValue;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V", "literal", "validateLiteral", "(Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuildingValue implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.BuildingValue INSTANCE = new com.izettle.android.serialization.JsonParserContext.BuildingValue();

        private BuildingValue() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        private final void validateLiteral(java.lang.String literal, int position) {
            if (com.izettle.android.serialization.JsonParser.INSTANCE.getVALUE_REGEX().matches(literal)) {
                return;
            }
            int length = literal.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid literal \"");
            sb.append(literal);
            sb.append("\", at index ");
            sb.append(position - length);
            throw new com.izettle.android.serialization.JsonParseException(sb.toString());
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (kotlin.text.CharsKt.isWhitespace(charAt)) {
                java.lang.String obj = context.getHighSpeedVideoFpsRangesFor.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                validateLiteral(obj, position);
                com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoFpsRanges(context);
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.ValueBuilt.INSTANCE);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.COMMA.getValue() == charAt) {
                java.lang.String obj2 = context.getHighSpeedVideoFpsRangesFor.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                validateLiteral(obj2, position);
                com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoFpsRanges(context);
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.END_OBJECT.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.State state = context.getHighSpeedVideoSizes.get(r1.size() - 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.izettle.android.serialization.JsonParserContext.BeginObject.INSTANCE)) {
                    java.lang.String obj3 = context.getHighSpeedVideoFpsRangesFor.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                    validateLiteral(obj3, position);
                    com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoFpsRanges(context);
                    com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                    com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoFpsRangesFor(context);
                    return;
                }
            }
            if (com.izettle.android.serialization.JsonToken.END_ARRAY.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.State state2 = context.getHighSpeedVideoSizes.get(r1.size() - 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state2, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(state2, com.izettle.android.serialization.JsonParserContext.BeginArray.INSTANCE)) {
                    java.lang.String obj4 = context.getHighSpeedVideoFpsRangesFor.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj4, "");
                    validateLiteral(obj4, position);
                    com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoFpsRanges(context);
                    com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                    com.izettle.android.serialization.JsonParserContext.getHighResolutionOutputSizeshNQ4ISI(context);
                    return;
                }
            }
            context.getHighSpeedVideoFpsRangesFor.append(charAt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$ValueBuilt;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValueBuilt implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.ValueBuilt INSTANCE = new com.izettle.android.serialization.JsonParserContext.ValueBuilt();

        private ValueBuilt() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (kotlin.text.CharsKt.isWhitespace(charAt)) {
                return;
            }
            if (com.izettle.android.serialization.JsonToken.COMMA.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.END_OBJECT.getValue() == charAt) {
                java.util.Stack<com.izettle.android.serialization.JsonParserContext.State> stack = context.getHighSpeedVideoSizes;
                com.izettle.android.serialization.JsonParserContext.State state = stack.get(stack.size() - 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.izettle.android.serialization.JsonParserContext.BeginObject.INSTANCE)) {
                    com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                    com.izettle.android.serialization.JsonParserContext.getHighSpeedVideoFpsRangesFor(context);
                    return;
                }
            }
            if (com.izettle.android.serialization.JsonToken.END_ARRAY.getValue() == charAt) {
                java.util.Stack<com.izettle.android.serialization.JsonParserContext.State> stack2 = context.getHighSpeedVideoSizes;
                com.izettle.android.serialization.JsonParserContext.State state2 = stack2.get(stack2.size() - 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state2, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(state2, com.izettle.android.serialization.JsonParserContext.BeginArray.INSTANCE)) {
                    com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                    com.izettle.android.serialization.JsonParserContext.getHighResolutionOutputSizeshNQ4ISI(context);
                    return;
                }
            }
            throw new com.izettle.android.serialization.JsonParseException(charAt, position, context.getHighSpeedVideoFpsRanges, com.izettle.android.serialization.JsonToken.COMMA.getValue(), com.izettle.android.serialization.JsonToken.END_OBJECT.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$ColonReceived;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ColonReceived implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.ColonReceived INSTANCE = new com.izettle.android.serialization.JsonParserContext.ColonReceived();

        private ColonReceived() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
            com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.endOfInputReached(this);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            char charAt = inputString.charAt(position);
            if (kotlin.text.CharsKt.isWhitespace(charAt)) {
                return;
            }
            if (com.izettle.android.serialization.JsonToken.SINGLE_QUOTE.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingStringValueSingle.INSTANCE);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.DOUBLE_QUOTE.getValue() == charAt) {
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingStringValueDouble.INSTANCE);
                return;
            }
            if (com.izettle.android.serialization.JsonToken.BEGIN_OBJECT.getValue() == charAt) {
                context.Camera2StreamConfigurationMap.beginObject();
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BeginObject.INSTANCE);
            } else if (com.izettle.android.serialization.JsonToken.BEGIN_ARRAY.getValue() == charAt) {
                context.Camera2StreamConfigurationMap.beginArray();
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BeginArray.INSTANCE);
            } else {
                context.getHighSpeedVideoFpsRangesFor.append(charAt);
                com.izettle.android.serialization.JsonParserContext.getOutputFormats(context);
                context.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.BuildingValue.INSTANCE);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/izettle/android/serialization/JsonParserContext$Finalized;", "Lcom/izettle/android/serialization/JsonParserContext$State;", "<init>", "()V", "", "endOfInputReached", "Lcom/izettle/android/serialization/JsonParserContext;", "context", "", "inputString", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "parseChar", "(Lcom/izettle/android/serialization/JsonParserContext;Ljava/lang/String;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Finalized implements com.izettle.android.serialization.JsonParserContext.State {
        public static final com.izettle.android.serialization.JsonParserContext.Finalized INSTANCE = new com.izettle.android.serialization.JsonParserContext.Finalized();

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void endOfInputReached() {
        }

        private Finalized() {
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final int parseChars(com.izettle.android.serialization.JsonParserContext jsonParserContext, java.lang.String str, int i) {
            return com.izettle.android.serialization.JsonParserContext.State.DefaultImpls.parseChars(this, jsonParserContext, str, i);
        }

        @Override // com.izettle.android.serialization.JsonParserContext.State
        public final void parseChar(com.izettle.android.serialization.JsonParserContext context, java.lang.String inputString, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputString, "");
            if (!kotlin.text.CharsKt.isWhitespace(inputString.charAt(position))) {
                throw new com.izettle.android.serialization.JsonParseException(inputString.charAt(position), position, context.getHighSpeedVideoFpsRanges, new char[0]);
            }
        }
    }

    public static final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.izettle.android.serialization.JsonParserContext jsonParserContext) {
        jsonParserContext.getHighSpeedVideoSizes.pop();
        jsonParserContext.Camera2StreamConfigurationMap.endArray();
        com.izettle.android.serialization.JsonParserContext.State peek = jsonParserContext.getHighSpeedVideoSizes.peek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(peek, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(peek, com.izettle.android.serialization.JsonParserContext.Initial.INSTANCE)) {
            jsonParserContext.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.ValueBuilt.INSTANCE);
        } else {
            jsonParserContext.getHighSpeedVideoSizes.pop();
            jsonParserContext.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.Finalized.INSTANCE);
        }
    }

    public static final /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.izettle.android.serialization.JsonParserContext jsonParserContext) {
        jsonParserContext.getHighSpeedVideoSizes.pop();
        jsonParserContext.Camera2StreamConfigurationMap.endObject();
        com.izettle.android.serialization.JsonParserContext.State peek = jsonParserContext.getHighSpeedVideoSizes.peek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(peek, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(peek, com.izettle.android.serialization.JsonParserContext.Initial.INSTANCE)) {
            jsonParserContext.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.ValueBuilt.INSTANCE);
        } else {
            jsonParserContext.getHighSpeedVideoSizes.pop();
            jsonParserContext.getHighSpeedVideoSizes.push(com.izettle.android.serialization.JsonParserContext.Finalized.INSTANCE);
        }
    }

    public static final /* synthetic */ void Camera2StreamConfigurationMap(com.izettle.android.serialization.JsonParserContext jsonParserContext) {
        java.lang.String obj = jsonParserContext.getHighResolutionOutputSizeshNQ4ISI.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        jsonParserContext.Camera2StreamConfigurationMap.keyParsed(obj);
        kotlin.text.StringsKt.clear(jsonParserContext.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static final /* synthetic */ void getHighSpeedVideoFpsRanges(com.izettle.android.serialization.JsonParserContext jsonParserContext) {
        com.izettle.android.serialization.JsonElement asJsonElement;
        java.lang.String obj = jsonParserContext.getHighSpeedVideoFpsRangesFor.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.izettle.android.serialization.JsonParser.Callbacks callbacks = jsonParserContext.Camera2StreamConfigurationMap;
        asJsonElement = com.izettle.android.serialization.JsonParserKt.asJsonElement(obj);
        callbacks.valueParsed(asJsonElement);
        kotlin.text.StringsKt.clear(jsonParserContext.getHighSpeedVideoFpsRangesFor);
    }

    public static final /* synthetic */ void getHighSpeedVideoSizes(com.izettle.android.serialization.JsonParserContext jsonParserContext) {
        java.lang.String obj = jsonParserContext.getHighSpeedVideoFpsRangesFor.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        jsonParserContext.Camera2StreamConfigurationMap.valueParsed(new com.izettle.android.serialization.JsonPrimitive(obj));
        kotlin.text.StringsKt.clear(jsonParserContext.getHighSpeedVideoFpsRangesFor);
    }

    public static final /* synthetic */ void getOutputFormats(com.izettle.android.serialization.JsonParserContext jsonParserContext) {
        jsonParserContext.getHighSpeedVideoSizes.pop();
    }
}
