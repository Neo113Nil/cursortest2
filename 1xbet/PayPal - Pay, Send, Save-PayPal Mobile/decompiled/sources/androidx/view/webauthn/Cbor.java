package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000b8\u0007X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001a\u0010!\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016"}, d2 = {"Landroidx/credentials/webauthn/Cbor;", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "decode", "([B)Ljava/lang/Object;", "encode", "(Ljava/lang/Object;)[B", "p0", "", "p1", "Landroidx/credentials/webauthn/Cbor$Item;", "Camera2StreamConfigurationMap", "([BI)Landroidx/credentials/webauthn/Cbor$Item;", "", "getHighSpeedVideoSizes", "(IJ)[B", "TYPE_UNSIGNED_INT", com.visa.cbp.getEncExpo.warmup, "getTYPE_UNSIGNED_INT", "()I", "TYPE_NEGATIVE_INT", "getTYPE_NEGATIVE_INT", "TYPE_BYTE_STRING", "getTYPE_BYTE_STRING", "TYPE_TEXT_STRING", "getTYPE_TEXT_STRING", "TYPE_ARRAY", "getTYPE_ARRAY", "TYPE_MAP", "getTYPE_MAP", "TYPE_TAG", "getTYPE_TAG", "TYPE_FLOAT", "getTYPE_FLOAT", "Item", "Arg"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Cbor {
    private final int TYPE_UNSIGNED_INT;
    private final int TYPE_NEGATIVE_INT = 1;
    private final int TYPE_BYTE_STRING = 2;
    private final int TYPE_TEXT_STRING = 3;
    private final int TYPE_ARRAY = 4;
    private final int TYPE_MAP = 5;
    private final int TYPE_TAG = 6;
    private final int TYPE_FLOAT = 7;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Landroidx/credentials/webauthn/Cbor$Item;", "", "item", "", "len", "<init>", "(Ljava/lang/Object;I)V", "component1", "()Ljava/lang/Object;", "component2", "()I", "copy", "(Ljava/lang/Object;I)Landroidx/credentials/webauthn/Cbor$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getItem", com.visa.cbp.getEncExpo.warmup, "getLen"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {
        private final java.lang.Object item;
        private final int len;

        public Item(java.lang.Object obj, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.item = obj;
            this.len = i;
        }

        public final java.lang.Object getItem() {
            return this.item;
        }

        public final int getLen() {
            return this.len;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(item=");
            sb.append(this.item);
            sb.append(", len=");
            sb.append(this.len);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.item.hashCode() * 31) + java.lang.Integer.hashCode(this.len);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.credentials.webauthn.Cbor.Item)) {
                return false;
            }
            androidx.credentials.webauthn.Cbor.Item item = (androidx.credentials.webauthn.Cbor.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.item, item.item) && this.len == item.len;
        }

        public final androidx.credentials.webauthn.Cbor.Item copy(java.lang.Object item, int len) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new androidx.credentials.webauthn.Cbor.Item(item, len);
        }

        /* renamed from: component2, reason: from getter */
        public final int getLen() {
            return this.len;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getItem() {
            return this.item;
        }

        public static /* synthetic */ androidx.credentials.webauthn.Cbor.Item copy$default(androidx.credentials.webauthn.Cbor.Item item, java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
            if ((i2 & 1) != 0) {
                obj = item.item;
            }
            if ((i2 & 2) != 0) {
                i = item.len;
            }
            return item.copy(obj, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Landroidx/credentials/webauthn/Cbor$Arg;", "", "", "arg", "", "len", "<init>", "(JI)V", "component1", "()J", "component2", "()I", "copy", "(JI)Landroidx/credentials/webauthn/Cbor$Arg;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "J", "getArg", com.visa.cbp.getEncExpo.warmup, "getLen"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Arg {
        private final long arg;
        private final int len;

        public Arg(long j, int i) {
            this.arg = j;
            this.len = i;
        }

        public final long getArg() {
            return this.arg;
        }

        public final int getLen() {
            return this.len;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Arg(arg=");
            sb.append(this.arg);
            sb.append(", len=");
            sb.append(this.len);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.arg) * 31) + java.lang.Integer.hashCode(this.len);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.credentials.webauthn.Cbor.Arg)) {
                return false;
            }
            androidx.credentials.webauthn.Cbor.Arg arg = (androidx.credentials.webauthn.Cbor.Arg) other;
            return this.arg == arg.arg && this.len == arg.len;
        }

        public final androidx.credentials.webauthn.Cbor.Arg copy(long arg, int len) {
            return new androidx.credentials.webauthn.Cbor.Arg(arg, len);
        }

        /* renamed from: component2, reason: from getter */
        public final int getLen() {
            return this.len;
        }

        /* renamed from: component1, reason: from getter */
        public final long getArg() {
            return this.arg;
        }

        public static /* synthetic */ androidx.credentials.webauthn.Cbor.Arg copy$default(androidx.credentials.webauthn.Cbor.Arg arg, long j, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                j = arg.arg;
            }
            if ((i2 & 2) != 0) {
                i = arg.len;
            }
            return arg.copy(j, i);
        }
    }

    public final int getTYPE_UNSIGNED_INT() {
        return this.TYPE_UNSIGNED_INT;
    }

    public final int getTYPE_NEGATIVE_INT() {
        return this.TYPE_NEGATIVE_INT;
    }

    public final int getTYPE_BYTE_STRING() {
        return this.TYPE_BYTE_STRING;
    }

    public final int getTYPE_TEXT_STRING() {
        return this.TYPE_TEXT_STRING;
    }

    public final int getTYPE_ARRAY() {
        return this.TYPE_ARRAY;
    }

    public final int getTYPE_MAP() {
        return this.TYPE_MAP;
    }

    public final int getTYPE_TAG() {
        return this.TYPE_TAG;
    }

    public final int getTYPE_FLOAT() {
        return this.TYPE_FLOAT;
    }

    public final java.lang.Object decode(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return Camera2StreamConfigurationMap(data, 0).getItem();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.util.Map] */
    public final byte[] encode(java.lang.Object data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        if (data instanceof java.lang.Number) {
            if (data instanceof java.lang.Double) {
                throw new java.lang.IllegalArgumentException("Don't support doubles yet");
            }
            long longValue = ((java.lang.Number) data).longValue();
            if (longValue >= 0) {
                return getHighSpeedVideoSizes(this.TYPE_UNSIGNED_INT, longValue);
            }
            return getHighSpeedVideoSizes(this.TYPE_NEGATIVE_INT, (-1) - longValue);
        }
        if (data instanceof byte[]) {
            return kotlin.collections.ArraysKt.plus(getHighSpeedVideoSizes(this.TYPE_BYTE_STRING, r7.length), (byte[]) data);
        }
        if (data instanceof java.lang.String) {
            return kotlin.collections.ArraysKt.plus(getHighSpeedVideoSizes(this.TYPE_TEXT_STRING, r7.length()), kotlin.text.StringsKt.encodeToByteArray((java.lang.String) data));
        }
        if (data instanceof java.util.List) {
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(this.TYPE_ARRAY, r7.size());
            for (java.lang.Object obj : (java.util.List) data) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                highSpeedVideoSizes = kotlin.collections.ArraysKt.plus(highSpeedVideoSizes, encode(obj));
            }
            return highSpeedVideoSizes;
        }
        if (data instanceof java.util.Map) {
            byte[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(this.TYPE_MAP, r7.size());
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : ((java.util.Map) data).entrySet()) {
                java.util.Map map = (java.util.Map) objectRef.element;
                java.lang.Object key = entry.getKey();
                kotlin.jvm.internal.Intrinsics.checkNotNull(key);
                byte[] encode = encode(key);
                java.lang.Object value = entry.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value);
                map.put(encode, encode(value));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(((java.util.Map) objectRef.element).keySet());
            kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: androidx.credentials.webauthn.Cbor$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.view.webauthn.Cbor.m9142$r8$lambda$U5sWomJCMWgLesGf2T6PiR8A4(kotlin.jvm.internal.Ref.ObjectRef.this, (byte[]) obj2, (byte[]) obj3);
                }
            });
            java.util.Iterator it = arrayList.iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "");
                byte[] bArr = (byte[]) next;
                byte[] plus = kotlin.collections.ArraysKt.plus(highSpeedVideoSizes2, bArr);
                java.lang.Object obj2 = ((java.util.Map) objectRef.element).get(bArr);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                highSpeedVideoSizes2 = kotlin.collections.ArraysKt.plus(plus, (byte[]) obj2);
            }
            return highSpeedVideoSizes2;
        }
        throw new java.lang.IllegalArgumentException("Bad type");
    }

    private static byte[] getHighSpeedVideoSizes(int p0, long p1) {
        int i = p0 << 5;
        int i2 = (int) p1;
        if (p1 < 24) {
            return new byte[]{(byte) ((i | i2) & 255)};
        }
        if (p1 <= 255) {
            return new byte[]{(byte) ((i | 24) & 255), (byte) (i2 & 255)};
        }
        if (p1 <= okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return new byte[]{(byte) ((i | 25) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)};
        }
        if (p1 <= 4294967295L) {
            return new byte[]{(byte) ((i | 26) & 255), (byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)};
        }
        throw new java.lang.IllegalArgumentException("bad Arg");
    }

    /* renamed from: $r8$lambda$U-5sWomJCMWgLesGf2T6PiR8-A4, reason: not valid java name */
    public static /* synthetic */ int m9142$r8$lambda$U5sWomJCMWgLesGf2T6PiR8A4(kotlin.jvm.internal.Ref.ObjectRef objectRef, byte[] bArr, byte[] bArr2) {
        java.lang.Object obj = ((java.util.Map) objectRef.element).get(bArr);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        byte[] bArr3 = (byte[]) obj;
        java.lang.Object obj2 = ((java.util.Map) objectRef.element).get(bArr2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
        byte[] bArr4 = (byte[]) obj2;
        if (bArr.length > bArr2.length) {
            return 1;
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        if (bArr3.length > bArr4.length) {
            return 1;
        }
        return bArr3.length < bArr4.length ? -1 : 0;
    }

    private final androidx.credentials.webauthn.Cbor.Item Camera2StreamConfigurationMap(byte[] p0, int p1) {
        androidx.credentials.webauthn.Cbor.Arg arg;
        byte b = p0[p1];
        int i = (b & 255) >> 5;
        long j = b & 31;
        if (j < 24) {
            arg = new androidx.credentials.webauthn.Cbor.Arg(j, 1);
        } else if (j == 24) {
            arg = new androidx.credentials.webauthn.Cbor.Arg(p0[p1 + 1] & 255, 2);
        } else if (j == 25) {
            arg = new androidx.credentials.webauthn.Cbor.Arg(((p0[p1 + 1] & 255) << 8) | (p0[p1 + 2] & 255), 3);
        } else if (j == 26) {
            arg = new androidx.credentials.webauthn.Cbor.Arg(((p0[p1 + 1] & 255) << 24) | ((p0[p1 + 2] & 255) << 16) | ((255 & p0[p1 + 3]) << 8) | (p0[p1 + 4] & 255), 5);
        } else {
            throw new java.lang.IllegalArgumentException("Bad arg");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Type ");
        sb.append(i);
        sb.append(' ');
        sb.append(arg.getArg());
        sb.append(' ');
        sb.append(arg.getLen());
        java.lang.System.out.println((java.lang.Object) sb.toString());
        if (i == this.TYPE_UNSIGNED_INT) {
            return new androidx.credentials.webauthn.Cbor.Item(java.lang.Long.valueOf(arg.getArg()), arg.getLen());
        }
        if (i == this.TYPE_NEGATIVE_INT) {
            return new androidx.credentials.webauthn.Cbor.Item(java.lang.Long.valueOf((-1) - arg.getArg()), arg.getLen());
        }
        if (i == this.TYPE_BYTE_STRING) {
            return new androidx.credentials.webauthn.Cbor.Item(kotlin.collections.ArraysKt.sliceArray(p0, kotlin.ranges.RangesKt.until(arg.getLen() + p1, p1 + arg.getLen() + ((int) arg.getArg()))), arg.getLen() + ((int) arg.getArg()));
        }
        if (i == this.TYPE_TEXT_STRING) {
            return new androidx.credentials.webauthn.Cbor.Item(new java.lang.String(kotlin.collections.ArraysKt.sliceArray(p0, kotlin.ranges.RangesKt.until(arg.getLen() + p1, p1 + arg.getLen() + ((int) arg.getArg()))), kotlin.text.Charsets.UTF_8), arg.getLen() + ((int) arg.getArg()));
        }
        int i2 = 0;
        if (i == this.TYPE_ARRAY) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int len = arg.getLen();
            int arg2 = (int) arg.getArg();
            while (i2 < arg2) {
                androidx.credentials.webauthn.Cbor.Item Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(p0, p1 + len);
                arrayList.add(Camera2StreamConfigurationMap.getItem());
                len += Camera2StreamConfigurationMap.getLen();
                i2++;
            }
            return new androidx.credentials.webauthn.Cbor.Item(kotlin.collections.CollectionsKt.toList(arrayList), len);
        }
        if (i == this.TYPE_MAP) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            int len2 = arg.getLen();
            int arg3 = (int) arg.getArg();
            while (i2 < arg3) {
                androidx.credentials.webauthn.Cbor.Item Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(p0, p1 + len2);
                int len3 = len2 + Camera2StreamConfigurationMap2.getLen();
                androidx.credentials.webauthn.Cbor.Item Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(p0, p1 + len3);
                len2 = len3 + Camera2StreamConfigurationMap3.getLen();
                linkedHashMap.put(Camera2StreamConfigurationMap2.getItem(), Camera2StreamConfigurationMap3.getItem());
                i2++;
            }
            return new androidx.credentials.webauthn.Cbor.Item(kotlin.collections.MapsKt.toMap(linkedHashMap), len2);
        }
        throw new java.lang.IllegalArgumentException("Bad type");
    }
}
