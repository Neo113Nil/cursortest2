package com.apollographql.apollo.api.json;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 T2\u00020\u0001:\u0001TB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\rJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010\u001aJ\u0017\u0010\u0012\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020)H\u0002¢\u0006\u0004\b\u0012\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00104\u001a\u00020\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001802H\u0016¢\u0006\u0004\b4\u00105J\u0017\u0010\u0016\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u00106J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u00107J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020802H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010;J\u000f\u0010<\u001a\u00020,H\u0016¢\u0006\u0004\b<\u00100J\u0017\u0010*\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010=R\u0014\u0010@\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010*\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\u0016\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010DR\u0018\u0010K\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010C\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010DR\u001e\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010RR\u0016\u0010E\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010NR\u0016\u0010G\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010NR\u0016\u0010I\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010D"}, d2 = {"Lcom/apollographql/apollo/api/json/BufferedSourceJsonReader;", "Lcom/apollographql/apollo/api/json/JsonReader;", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "beginArray", "()Lcom/apollographql/apollo/api/json/JsonReader;", "endArray", "beginObject", "endObject", "", "hasNext", "()Z", "Lcom/apollographql/apollo/api/json/JsonReader$Token;", "peek", "()Lcom/apollographql/apollo/api/json/JsonReader$Token;", "", "getHighSpeedVideoSizes", "()I", "", "p0", "getHighSpeedVideoFpsRanges", "(C)Z", "", "nextName", "()Ljava/lang/String;", "nextString", "nextBoolean", "", "nextNull", "()Ljava/lang/Void;", "", "nextDouble", "()D", "", "nextLong", "()J", "Lcom/apollographql/apollo/api/json/JsonNumber;", "nextNumber", "()Lcom/apollographql/apollo/api/json/JsonNumber;", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", "(Lokio/ByteString;)Ljava/lang/String;", "", "(Lokio/ByteString;)V", "nextInt", "close", "()V", "skipValue", "", "names", "selectName", "(Ljava/util/List;)I", "(I)V", "(Z)I", "", "getPath", "()Ljava/util/List;", "()C", "rewind", "(Ljava/lang/String;)Ljava/lang/Void;", "getOutputStallDurationlomOqCM", "Lokio/BufferedSource;", "Camera2StreamConfigurationMap", "Lokio/Buffer;", "Lokio/Buffer;", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "J", "getOutputSizes", "getHighResolutionOutputSizeshNQ4ISI", "getOutputSizeshNQ4ISI", "Ljava/lang/String;", "getOutputMinFrameDuration", "", "getOutputMinFrameDurationlomOqCM", "[I", "getOutputStallDuration", "getHighSpeedVideoSizesFor", "", "[Ljava/lang/String;", "getOutputFormats", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BufferedSourceJsonReader implements com.apollographql.apollo.api.json.JsonReader {
    public static final int INITIAL_STACK_SIZE = 64;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int[] getOutputSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okio.Buffer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.lang.String[] getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int[] getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private int[] getInputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getOutputMinFrameDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final okio.BufferedSource Camera2StreamConfigurationMap;
    private static final okio.ByteString Camera2StreamConfigurationMap = okio.ByteString.INSTANCE.encodeUtf8("'\\");
    private static final okio.ByteString getHighSpeedVideoFpsRanges = okio.ByteString.INSTANCE.encodeUtf8("\"\\");
    private static final okio.ByteString getHighSpeedVideoFpsRangesFor = okio.ByteString.INSTANCE.encodeUtf8("{}[]:, \n\t\r/\\;#=");

    public BufferedSourceJsonReader(okio.BufferedSource bufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        this.Camera2StreamConfigurationMap = bufferedSource;
        this.getHighSpeedVideoFpsRangesFor = bufferedSource.getBuffer();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.getInputFormats = iArr;
        this.getHighSpeedVideoSizesFor = 1;
        this.getOutputFormats = new java.lang.String[64];
        this.getInputSizeshNQ4ISI = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.getOutputSizes = iArr2;
        this.getOutputSizeshNQ4ISI = 1;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final com.apollographql.apollo.api.json.JsonReader beginArray() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes()) == 3) {
            getHighSpeedVideoFpsRanges(1);
            this.getInputSizeshNQ4ISI[this.getHighSpeedVideoSizesFor - 1] = 0;
            this.getHighSpeedVideoSizes = 0;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(getCamera2StreamConfigurationMap());
        sb.append(" at path ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
        throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final com.apollographql.apollo.api.json.JsonReader endArray() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes()) == 4) {
            int i = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = i - 1;
            int[] iArr = this.getInputSizeshNQ4ISI;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.getHighSpeedVideoSizes = 0;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_ARRAY but was ");
        sb.append(getCamera2StreamConfigurationMap());
        sb.append(" at path ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
        throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final com.apollographql.apollo.api.json.JsonReader beginObject() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes()) == 1) {
            getHighSpeedVideoFpsRanges(3);
            this.getHighSpeedVideoSizes = 0;
            int i = this.getOutputSizeshNQ4ISI;
            this.getOutputSizeshNQ4ISI = i + 1;
            this.getOutputSizes[i] = 0;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(getCamera2StreamConfigurationMap());
        sb.append(" at path ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
        throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final com.apollographql.apollo.api.json.JsonReader endObject() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes()) == 2) {
            int i = this.getHighSpeedVideoSizesFor;
            int i2 = i - 1;
            this.getHighSpeedVideoSizesFor = i2;
            this.getOutputFormats[i2] = null;
            int[] iArr = this.getInputSizeshNQ4ISI;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.getHighSpeedVideoSizes = 0;
            this.getOutputSizeshNQ4ISI--;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_OBJECT but was ");
        sb.append(getCamera2StreamConfigurationMap());
        sb.append(" at path ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
        throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final boolean hasNext() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: peek */
    public final com.apollographql.apollo.api.json.JsonReader.Token getCamera2StreamConfigurationMap() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes()) {
            case 1:
                return com.apollographql.apollo.api.json.JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return com.apollographql.apollo.api.json.JsonReader.Token.END_OBJECT;
            case 3:
                return com.apollographql.apollo.api.json.JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return com.apollographql.apollo.api.json.JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return com.apollographql.apollo.api.json.JsonReader.Token.BOOLEAN;
            case 7:
                return com.apollographql.apollo.api.json.JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return com.apollographql.apollo.api.json.JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
                return com.apollographql.apollo.api.json.JsonReader.Token.NAME;
            case 15:
                return com.apollographql.apollo.api.json.JsonReader.Token.LONG;
            case 16:
                return com.apollographql.apollo.api.json.JsonReader.Token.NUMBER;
            case 17:
                return com.apollographql.apollo.api.json.JsonReader.Token.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0235, code lost:
    
        if (r5 != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0237, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0238, code lost:
    
        r17.getHighSpeedVideoFpsRanges = r6;
        r17.getHighSpeedVideoFpsRangesFor.skip(r10);
        r13 = 15;
        r17.getHighSpeedVideoSizes = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0244, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0245, code lost:
    
        if (r1 == r3) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0248, code lost:
    
        if (r1 == 4) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024b, code lost:
    
        if (r1 == 7) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024e, code lost:
    
        r17.getHighResolutionOutputSizeshNQ4ISI = r2;
        r13 = 16;
        r17.getHighSpeedVideoSizes = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fc, code lost:
    
        if (getHighSpeedVideoFpsRanges(r12) == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0228, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0229, code lost:
    
        if (r1 != 2) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022b, code lost:
    
        if (r4 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0231, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0233, code lost:
    
        if (r5 == false) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int getHighSpeedVideoSizes() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        byte b;
        int i;
        char c;
        int[] iArr = this.getInputFormats;
        int i2 = this.getHighSpeedVideoSizesFor - 1;
        int i3 = iArr[i2];
        java.lang.String str4 = "Malformed JSON";
        int i4 = 0;
        switch (i3) {
            case 1:
                iArr[i2] = 2;
                break;
            case 2:
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(true);
                this.getHighSpeedVideoFpsRangesFor.readByte();
                char c2 = (char) highSpeedVideoFpsRanges;
                if (c2 != ',') {
                    if (c2 == ']') {
                        this.getHighSpeedVideoSizes = 4;
                        return 4;
                    }
                    getHighSpeedVideoFpsRangesFor("Unterminated array");
                    throw new kotlin.KotlinNothingValueException();
                }
                break;
            case 3:
            case 5:
                iArr[i2] = 4;
                if (i3 == 5) {
                    int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(true);
                    this.getHighSpeedVideoFpsRangesFor.readByte();
                    char c3 = (char) highSpeedVideoFpsRanges2;
                    if (c3 != ',') {
                        if (c3 == '}') {
                            this.getHighSpeedVideoSizes = 2;
                            return 2;
                        }
                        getHighSpeedVideoFpsRangesFor("Unterminated object");
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
                char highSpeedVideoFpsRanges3 = (char) getHighSpeedVideoFpsRanges(true);
                if (highSpeedVideoFpsRanges3 == '\"') {
                    this.getHighSpeedVideoFpsRangesFor.readByte();
                    this.getHighSpeedVideoSizes = 13;
                    return 13;
                }
                if (highSpeedVideoFpsRanges3 != '}') {
                    getHighSpeedVideoFpsRangesFor("Unexpected character: ".concat(java.lang.String.valueOf(highSpeedVideoFpsRanges3)));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (i3 != 5) {
                    this.getHighSpeedVideoFpsRangesFor.readByte();
                    this.getHighSpeedVideoSizes = 2;
                    return 2;
                }
                getHighSpeedVideoFpsRangesFor("Expected name");
                throw new kotlin.KotlinNothingValueException();
            case 4:
                iArr[i2] = 5;
                int highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(true);
                this.getHighSpeedVideoFpsRangesFor.readByte();
                if (((char) highSpeedVideoFpsRanges4) != ':') {
                    getHighSpeedVideoFpsRangesFor("Expected ':'");
                    throw new kotlin.KotlinNothingValueException();
                }
                break;
            case 6:
                iArr[i2] = 7;
                break;
            case 7:
                if (getHighSpeedVideoFpsRanges(false) == -1) {
                    this.getHighSpeedVideoSizes = 17;
                    return 17;
                }
                getHighSpeedVideoFpsRangesFor("Malformed JSON");
                throw new kotlin.KotlinNothingValueException();
            default:
                if (i3 == 8) {
                    throw new java.lang.IllegalStateException("JsonReader is closed".toString());
                }
                break;
        }
        char highSpeedVideoFpsRanges5 = (char) getHighSpeedVideoFpsRanges(true);
        if (highSpeedVideoFpsRanges5 == '\"') {
            this.getHighSpeedVideoFpsRangesFor.readByte();
            this.getHighSpeedVideoSizes = 9;
            return 9;
        }
        if (highSpeedVideoFpsRanges5 == '\'' || highSpeedVideoFpsRanges5 == ',' || highSpeedVideoFpsRanges5 == ';') {
            getHighSpeedVideoFpsRangesFor("Unexpected value");
            throw new kotlin.KotlinNothingValueException();
        }
        if (highSpeedVideoFpsRanges5 == '[') {
            this.getHighSpeedVideoFpsRangesFor.readByte();
            this.getHighSpeedVideoSizes = 3;
            return 3;
        }
        if (highSpeedVideoFpsRanges5 == ']') {
            if (i3 == 1) {
                this.getHighSpeedVideoFpsRangesFor.readByte();
                this.getHighSpeedVideoSizes = 4;
                return 4;
            }
            getHighSpeedVideoFpsRangesFor("Unexpected value");
            throw new kotlin.KotlinNothingValueException();
        }
        if (highSpeedVideoFpsRanges5 == '{') {
            this.getHighSpeedVideoFpsRangesFor.readByte();
            this.getHighSpeedVideoSizes = 1;
            return 1;
        }
        byte b2 = this.getHighSpeedVideoFpsRangesFor.getByte(0L);
        long j = 1;
        if (b2 == 116 || b2 == 84) {
            str = "true";
            str2 = "TRUE";
            i4 = 5;
        } else if (b2 == 102 || b2 == 70) {
            str = "false";
            str2 = "FALSE";
            i4 = 6;
        } else if (b2 != 110 && b2 != 78) {
            str3 = "Malformed JSON";
            if (i4 == 0) {
                return i4;
            }
            boolean z = true;
            char c4 = 0;
            int i5 = 0;
            boolean z2 = false;
            long j2 = 0;
            while (true) {
                long j3 = i5;
                if (this.Camera2StreamConfigurationMap.request(j3 + j)) {
                    byte b3 = this.getHighSpeedVideoFpsRangesFor.getByte(j3);
                    char c5 = (char) b3;
                    if (c5 == '+') {
                        c = 5;
                        if (c4 == 5) {
                            c4 = 6;
                            i5++;
                            j = 1;
                        }
                    } else if (c5 == 'E' || c5 == 'e') {
                        if (c4 == 2 || c4 == 4) {
                            c4 = 5;
                            c = 5;
                            i5++;
                            j = 1;
                        }
                    } else if (c5 == '-') {
                        if (c4 == 0) {
                            c4 = 1;
                            z2 = true;
                        } else if (c4 == 5) {
                            c4 = 6;
                        }
                        c = 5;
                        i5++;
                        j = 1;
                    } else if (c5 != '.') {
                        if (b3 >= 48 && b3 <= 57) {
                            if (c4 == 0 || c4 == 1) {
                                j2 = -(b3 - 48);
                                c4 = 2;
                            } else if (c4 != 2) {
                                if (c4 == 3) {
                                    c4 = 4;
                                } else if (c4 == 5 || c4 == 6) {
                                    c4 = 7;
                                }
                            } else if (j2 != 0) {
                                long j4 = (10 * j2) - (b3 - 48);
                                z = (z && ((j2 > (-922337203685477580L) ? 1 : (j2 == (-922337203685477580L) ? 0 : -1)) > 0)) || (j2 == -922337203685477580L && j4 < j2);
                                j2 = j4;
                            }
                            c = 5;
                            i5++;
                            j = 1;
                        }
                    } else if (c4 == 2) {
                        c4 = 3;
                        c = 5;
                        i5++;
                        j = 1;
                    }
                    if (i == 0) {
                        return i;
                    }
                    if (!getHighSpeedVideoFpsRanges((char) this.getHighSpeedVideoFpsRangesFor.getByte(0L))) {
                        getHighSpeedVideoFpsRangesFor("Expected value");
                        throw new kotlin.KotlinNothingValueException();
                    }
                    getHighSpeedVideoFpsRangesFor(str3);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            i = 0;
            if (i == 0) {
            }
        } else {
            str = "null";
            str2 = "NULL";
            i4 = 7;
        }
        int length = str.length();
        int i6 = 1;
        while (true) {
            if (i6 < length) {
                str3 = str4;
                long j5 = i6;
                if (this.Camera2StreamConfigurationMap.request(j5 + 1) && ((b = this.getHighSpeedVideoFpsRangesFor.getByte(j5)) == ((byte) str.charAt(i6)) || b == ((byte) str2.charAt(i6)))) {
                    i6++;
                    str4 = str3;
                }
            } else {
                str3 = str4;
                long j6 = length;
                if (!this.Camera2StreamConfigurationMap.request(j6 + 1) || !getHighSpeedVideoFpsRanges((char) this.getHighSpeedVideoFpsRangesFor.getByte(j6))) {
                    this.getHighSpeedVideoFpsRangesFor.skip(j6);
                    this.getHighSpeedVideoSizes = i4;
                }
            }
        }
        i4 = 0;
        if (i4 == 0) {
        }
    }

    private final boolean getHighSpeedVideoFpsRanges(char p0) {
        if (p0 == '\t' || p0 == '\n' || p0 == '\r' || p0 == ' ') {
            return false;
        }
        if (p0 != '#') {
            if (p0 == ',') {
                return false;
            }
            if (p0 != '/' && p0 != '=') {
                if (p0 == '{' || p0 == '}' || p0 == ':') {
                    return false;
                }
                if (p0 != ';') {
                    switch (p0) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        getHighSpeedVideoFpsRangesFor("Unexpected character: ".concat(java.lang.String.valueOf(p0)));
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final java.lang.String nextName() {
        java.lang.String highSpeedVideoFpsRangesFor;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes()) {
            case 12:
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
                break;
            case 13:
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges);
                break;
            case 14:
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                break;
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a name but was ");
                sb.append(getCamera2StreamConfigurationMap());
                sb.append(" at path ");
                sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
                throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
        }
        this.getHighSpeedVideoSizes = 0;
        this.getOutputFormats[this.getHighSpeedVideoSizesFor - 1] = highSpeedVideoFpsRangesFor;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final java.lang.String nextString() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        java.lang.String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes();
        if (intValue == 15) {
            str = java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
                    break;
                case 9:
                    str = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges);
                    break;
                case 10:
                    str = getHighSpeedVideoFpsRangesFor();
                    break;
                case 11:
                    java.lang.String str2 = this.getOutputMinFrameDuration;
                    if (str2 != null) {
                        this.getOutputMinFrameDuration = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a string but was ");
                    sb.append(getCamera2StreamConfigurationMap());
                    sb.append(" at path ");
                    sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
                    throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
            }
        } else {
            str = this.getHighSpeedVideoFpsRangesFor.readUtf8(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getHighSpeedVideoSizes = 0;
        int[] iArr = this.getInputSizeshNQ4ISI;
        int i = this.getHighSpeedVideoSizesFor - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final boolean nextBoolean() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes();
        if (intValue == 5) {
            this.getHighSpeedVideoSizes = 0;
            int[] iArr = this.getInputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizesFor - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (intValue == 6) {
            this.getHighSpeedVideoSizes = 0;
            int[] iArr2 = this.getInputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizesFor - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a boolean but was ");
        sb.append(getCamera2StreamConfigurationMap());
        sb.append(" at path ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
        throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final java.lang.Void nextNull() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes()) == 7) {
            this.getHighSpeedVideoSizes = 0;
            int[] iArr = this.getInputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizesFor - 1;
            iArr[i] = iArr[i] + 1;
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected null but was ");
        sb.append(getCamera2StreamConfigurationMap());
        sb.append(" at path ");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
        throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final double nextDouble() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes();
        if (intValue == 15) {
            this.getHighSpeedVideoSizes = 0;
            int[] iArr = this.getInputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizesFor - 1;
            iArr[i] = iArr[i] + 1;
            return this.getHighSpeedVideoFpsRanges;
        }
        if (intValue == 16) {
            this.getOutputMinFrameDuration = this.getHighSpeedVideoFpsRangesFor.readUtf8(this.getHighResolutionOutputSizeshNQ4ISI);
        } else if (intValue == 9) {
            this.getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges);
        } else if (intValue == 8) {
            this.getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
        } else if (intValue == 10) {
            this.getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor();
        } else if (intValue != 11) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a double but was ");
            sb.append(getCamera2StreamConfigurationMap());
            sb.append(" at path ");
            sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
            throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
        }
        this.getHighSpeedVideoSizes = 11;
        try {
            java.lang.String str = this.getOutputMinFrameDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            double parseDouble = java.lang.Double.parseDouble(str);
            if (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(parseDouble);
                sb2.append(" at path ");
                sb2.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
                throw new com.apollographql.apollo.exception.JsonEncodingException(sb2.toString());
            }
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizes = 0;
            int[] iArr2 = this.getInputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizesFor - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return parseDouble;
        } catch (java.lang.NumberFormatException unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected a double but was ");
            sb3.append(this.getOutputMinFrameDuration);
            sb3.append(" at path ");
            sb3.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
            throw new com.apollographql.apollo.exception.JsonDataException(sb3.toString());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final long nextLong() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes();
        if (intValue == 15) {
            this.getHighSpeedVideoSizes = 0;
            int[] iArr = this.getInputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizesFor - 1;
            iArr[i] = iArr[i] + 1;
            return this.getHighSpeedVideoFpsRanges;
        }
        if (intValue == 16) {
            this.getOutputMinFrameDuration = this.getHighSpeedVideoFpsRangesFor.readUtf8(this.getHighResolutionOutputSizeshNQ4ISI);
        } else if (intValue == 9 || intValue == 8) {
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(intValue == 9 ? getHighSpeedVideoFpsRanges : Camera2StreamConfigurationMap);
            this.getOutputMinFrameDuration = highSpeedVideoFpsRangesFor;
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
                long parseLong = java.lang.Long.parseLong(highSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoSizes = 0;
                int[] iArr2 = this.getInputSizeshNQ4ISI;
                int i2 = this.getHighSpeedVideoSizesFor - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return parseLong;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a long but was ");
            sb.append(getCamera2StreamConfigurationMap());
            sb.append(" at path ");
            sb.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
            throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
        }
        this.getHighSpeedVideoSizes = 11;
        try {
            java.lang.String str = this.getOutputMinFrameDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            double parseDouble = java.lang.Double.parseDouble(str);
            long j = (long) parseDouble;
            if (j != parseDouble) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a long but was ");
                sb2.append(this.getOutputMinFrameDuration);
                sb2.append(" at path ");
                sb2.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
                throw new com.apollographql.apollo.exception.JsonDataException(sb2.toString());
            }
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizes = 0;
            int[] iArr3 = this.getInputSizeshNQ4ISI;
            int i3 = this.getHighSpeedVideoSizesFor - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j;
        } catch (java.lang.NumberFormatException unused2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected a long but was ");
            sb3.append(this.getOutputMinFrameDuration);
            sb3.append(" at path ");
            sb3.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
            throw new com.apollographql.apollo.exception.JsonDataException(sb3.toString());
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final com.apollographql.apollo.api.json.JsonNumber nextNumber() {
        java.lang.String nextString = nextString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(nextString);
        return new com.apollographql.apollo.api.json.JsonNumber(nextString);
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor(okio.ByteString p0) {
        java.lang.StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.Camera2StreamConfigurationMap.indexOfElement(p0);
            if (indexOfElement == -1) {
                getHighSpeedVideoFpsRangesFor("Unterminated string");
                throw new kotlin.KotlinNothingValueException();
            }
            if (this.getHighSpeedVideoFpsRangesFor.getByte(indexOfElement) != 92) {
                if (sb == null) {
                    java.lang.String readUtf8 = this.getHighSpeedVideoFpsRangesFor.readUtf8(indexOfElement);
                    this.getHighSpeedVideoFpsRangesFor.readByte();
                    return readUtf8;
                }
                sb.append(this.getHighSpeedVideoFpsRangesFor.readUtf8(indexOfElement));
                this.getHighSpeedVideoFpsRangesFor.readByte();
                java.lang.String obj = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                return obj;
            }
            if (sb == null) {
                sb = new java.lang.StringBuilder();
            }
            sb.append(this.getHighSpeedVideoFpsRangesFor.readUtf8(indexOfElement));
            this.getHighSpeedVideoFpsRangesFor.readByte();
            sb.append(getHighSpeedVideoFpsRanges());
        }
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor() {
        long indexOfElement = this.Camera2StreamConfigurationMap.indexOfElement(getHighSpeedVideoFpsRangesFor);
        return indexOfElement != -1 ? this.getHighSpeedVideoFpsRangesFor.readUtf8(indexOfElement) : this.getHighSpeedVideoFpsRangesFor.readUtf8();
    }

    private final void getHighSpeedVideoSizes(okio.ByteString p0) {
        while (true) {
            long indexOfElement = this.Camera2StreamConfigurationMap.indexOfElement(p0);
            if (indexOfElement == -1) {
                getHighSpeedVideoFpsRangesFor("Unterminated string");
                throw new kotlin.KotlinNothingValueException();
            }
            if (this.getHighSpeedVideoFpsRangesFor.getByte(indexOfElement) == 92) {
                this.getHighSpeedVideoFpsRangesFor.skip(indexOfElement + 1);
                getHighSpeedVideoFpsRanges();
            } else {
                this.getHighSpeedVideoFpsRangesFor.skip(indexOfElement + 1);
                return;
            }
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final int nextInt() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes();
        if (intValue == 15) {
            long j = this.getHighSpeedVideoFpsRanges;
            int i = (int) j;
            if (j != i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected an int but was ");
                sb.append(this.getHighSpeedVideoFpsRanges);
                sb.append(" at path ");
                sb.append(getPath());
                throw new com.apollographql.apollo.exception.JsonDataException(sb.toString());
            }
            this.getHighSpeedVideoSizes = 0;
            int[] iArr = this.getInputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizesFor - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (intValue == 16) {
            this.getOutputMinFrameDuration = this.getHighSpeedVideoFpsRangesFor.readUtf8(this.getHighResolutionOutputSizeshNQ4ISI);
        } else if (intValue == 9 || intValue == 8) {
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(intValue == 9 ? getHighSpeedVideoFpsRanges : Camera2StreamConfigurationMap);
            this.getOutputMinFrameDuration = highSpeedVideoFpsRangesFor;
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
                int parseInt = java.lang.Integer.parseInt(highSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoSizes = 0;
                int[] iArr2 = this.getInputSizeshNQ4ISI;
                int i3 = this.getHighSpeedVideoSizesFor - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseInt;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected an int but was ");
            sb2.append(getCamera2StreamConfigurationMap());
            sb2.append(" at path ");
            sb2.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
            throw new com.apollographql.apollo.exception.JsonDataException(sb2.toString());
        }
        this.getHighSpeedVideoSizes = 11;
        try {
            java.lang.String str = this.getOutputMinFrameDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            double parseDouble = java.lang.Double.parseDouble(str);
            int i4 = (int) parseDouble;
            if (i4 != parseDouble) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected an int but was ");
                sb3.append(this.getOutputMinFrameDuration);
                sb3.append(" at path ");
                sb3.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
                throw new com.apollographql.apollo.exception.JsonDataException(sb3.toString());
            }
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizes = 0;
            int[] iArr3 = this.getInputSizeshNQ4ISI;
            int i5 = this.getHighSpeedVideoSizesFor - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return i4;
        } catch (java.lang.NumberFormatException unused2) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected an int but was ");
            sb4.append(this.getOutputMinFrameDuration);
            sb4.append(" at path ");
            sb4.append(kotlin.collections.CollectionsKt.joinToString$default(getPath(), ".", null, null, 0, null, null, 62, null));
            throw new com.apollographql.apollo.exception.JsonDataException(sb4.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoSizes = 0;
        this.getInputFormats[0] = 8;
        this.getHighSpeedVideoSizesFor = 1;
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.Camera2StreamConfigurationMap.close();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final void skipValue() {
        int i = 0;
        do {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizes);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            switch (valueOf != null ? valueOf.intValue() : getHighSpeedVideoSizes()) {
                case 1:
                    getHighSpeedVideoFpsRanges(3);
                    i++;
                    break;
                case 2:
                    this.getHighSpeedVideoSizesFor--;
                    i--;
                    break;
                case 3:
                    getHighSpeedVideoFpsRanges(1);
                    i++;
                    break;
                case 4:
                    this.getHighSpeedVideoSizesFor--;
                    i--;
                    break;
                case 8:
                case 12:
                    getHighSpeedVideoSizes(Camera2StreamConfigurationMap);
                    break;
                case 9:
                case 13:
                    getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges);
                    break;
                case 10:
                case 14:
                    long indexOfElement = this.Camera2StreamConfigurationMap.indexOfElement(getHighSpeedVideoFpsRangesFor);
                    okio.Buffer buffer = this.getHighSpeedVideoFpsRangesFor;
                    if (indexOfElement == -1) {
                        indexOfElement = buffer.size();
                    }
                    buffer.skip(indexOfElement);
                    break;
                case 16:
                    this.getHighSpeedVideoFpsRangesFor.skip(this.getHighResolutionOutputSizeshNQ4ISI);
                    break;
            }
            this.getHighSpeedVideoSizes = 0;
        } while (i != 0);
        int[] iArr = this.getInputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoSizesFor - 1;
        iArr[i2] = iArr[i2] + 1;
        this.getOutputFormats[i2] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        skipValue();
     */
    @Override // com.apollographql.apollo.api.json.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int selectName(java.util.List<java.lang.String> names) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(names, "");
        if (names.isEmpty()) {
            return -1;
        }
        while (hasNext()) {
            java.lang.String nextName = nextName();
            int i = this.getOutputSizes[this.getOutputSizeshNQ4ISI - 1];
            if (kotlin.jvm.internal.Intrinsics.areEqual(names.get(i), nextName)) {
                int i2 = i + 1;
                this.getOutputSizes[this.getOutputSizeshNQ4ISI - 1] = i2;
                if (i2 == names.size()) {
                    this.getOutputSizes[this.getOutputSizeshNQ4ISI - 1] = 0;
                }
                return i;
            }
            int i3 = i;
            do {
                i3++;
                if (i3 == names.size()) {
                    i3 = 0;
                }
                if (i3 == i) {
                    break;
                }
            } while (!kotlin.jvm.internal.Intrinsics.areEqual(names.get(i3), nextName));
            int i4 = i3 + 1;
            this.getOutputSizes[this.getOutputSizeshNQ4ISI - 1] = i4;
            if (i4 == names.size()) {
                this.getOutputSizes[this.getOutputSizeshNQ4ISI - 1] = 0;
            }
            return i3;
        }
        return -1;
    }

    private final void getHighSpeedVideoFpsRanges(int p0) {
        int i = this.getHighSpeedVideoSizesFor;
        int[] iArr = this.getInputFormats;
        if (i == iArr.length) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getInputFormats = copyOf;
            java.lang.String[] strArr = this.getOutputFormats;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(strArr, strArr.length * 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            this.getOutputFormats = (java.lang.String[]) copyOf2;
            int[] iArr2 = this.getInputSizeshNQ4ISI;
            int[] copyOf3 = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf3, "");
            this.getInputSizeshNQ4ISI = copyOf3;
            int[] iArr3 = this.getOutputSizes;
            int[] copyOf4 = java.util.Arrays.copyOf(iArr3, iArr3.length * 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf4, "");
            this.getOutputSizes = copyOf4;
        }
        int[] iArr4 = this.getInputFormats;
        int i2 = this.getHighSpeedVideoSizesFor;
        this.getHighSpeedVideoSizesFor = i2 + 1;
        iArr4[i2] = p0;
    }

    private final int getHighSpeedVideoFpsRanges(boolean p0) {
        int i = 0;
        while (true) {
            long j = i;
            if (!this.Camera2StreamConfigurationMap.request(j + 1)) {
                if (p0) {
                    throw new java.io.EOFException("End of input");
                }
                return -1;
            }
            i++;
            byte b = this.getHighSpeedVideoFpsRangesFor.getByte(j);
            if (b != 9 && b != 10 && b != 13 && b != 32) {
                this.getHighSpeedVideoFpsRangesFor.skip(i - 1);
                if (b != 35) {
                    if (b != 47 || !this.Camera2StreamConfigurationMap.request(2L)) {
                        return b;
                    }
                    getHighSpeedVideoFpsRangesFor("Malformed JSON");
                    throw new kotlin.KotlinNothingValueException();
                }
                getHighSpeedVideoFpsRangesFor("Malformed JSON");
                throw new kotlin.KotlinNothingValueException();
            }
        }
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final java.util.List<java.lang.Object> getPath() {
        return com.apollographql.apollo.api.json.internal.JsonScope.INSTANCE.getPath(this.getHighSpeedVideoSizesFor, this.getInputFormats, this.getOutputFormats, this.getInputSizeshNQ4ISI);
    }

    private final char getHighSpeedVideoFpsRanges() {
        int i;
        if (!this.Camera2StreamConfigurationMap.request(1L)) {
            getHighSpeedVideoFpsRangesFor("Unterminated escape sequence");
            throw new kotlin.KotlinNothingValueException();
        }
        char readByte = (char) this.getHighSpeedVideoFpsRangesFor.readByte();
        if (readByte == '\n' || readByte == '\"' || readByte == '\'' || readByte == '/' || readByte == '\\') {
            return readByte;
        }
        if (readByte == 'b') {
            return '\b';
        }
        if (readByte == 'f') {
            return '\f';
        }
        if (readByte == 'n') {
            return '\n';
        }
        if (readByte == 'r') {
            return '\r';
        }
        if (readByte == 't') {
            return '\t';
        }
        if (readByte == 'u') {
            if (!this.Camera2StreamConfigurationMap.request(4L)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unterminated escape sequence at path ");
                sb.append(getPath());
                throw new java.io.EOFException(sb.toString());
            }
            char c = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte b = this.getHighSpeedVideoFpsRangesFor.getByte(i2);
                char c2 = (char) (c << 4);
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\\u");
                        sb2.append(this.getHighSpeedVideoFpsRangesFor.readUtf8(4L));
                        getHighSpeedVideoFpsRangesFor(sb2.toString());
                        throw new kotlin.KotlinNothingValueException();
                    }
                    i = b - 55;
                }
                c = (char) (c2 + i);
            }
            this.getHighSpeedVideoFpsRangesFor.skip(4L);
            return c;
        }
        getHighSpeedVideoFpsRangesFor("Invalid escape sequence: \\".concat(java.lang.String.valueOf(readByte)));
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public final void rewind() {
        throw new java.lang.IllegalStateException("BufferedSourceJsonReader cannot rewind.".toString());
    }

    private final java.lang.Void getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0);
        sb.append(" at path ");
        sb.append(getPath());
        throw new com.apollographql.apollo.exception.JsonEncodingException(sb.toString());
    }
}
