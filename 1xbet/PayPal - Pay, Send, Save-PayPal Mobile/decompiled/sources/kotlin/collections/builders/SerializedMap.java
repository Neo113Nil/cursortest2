package kotlin.collections.builders;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "", "p0", "<init>", "(Ljava/util/Map;)V", "()V", "Ljava/io/ObjectOutput;", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class SerializedMap implements java.io.Externalizable {
    private static final long serialVersionUID = 0;
    private java.util.Map<?, ?> Camera2StreamConfigurationMap;

    public SerializedMap(java.util.Map<?, ?> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.Camera2StreamConfigurationMap = map;
    }

    public SerializedMap() {
        this(kotlin.collections.MapsKt.emptyMap());
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.writeByte(0);
        p0.writeInt(this.Camera2StreamConfigurationMap.size());
        for (java.util.Map.Entry<?, ?> entry : this.Camera2StreamConfigurationMap.entrySet()) {
            p0.writeObject(entry.getKey());
            p0.writeObject(entry.getValue());
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        byte readByte = p0.readByte();
        if (readByte != 0) {
            throw new java.io.InvalidObjectException("Unsupported flags value: ".concat(java.lang.String.valueOf((int) readByte)));
        }
        int readInt = p0.readInt();
        if (readInt < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal size value: ");
            sb.append(readInt);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.io.InvalidObjectException(sb.toString());
        }
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder(readInt);
        for (int i = 0; i < readInt; i++) {
            createMapBuilder.put(p0.readObject(), p0.readObject());
        }
        this.Camera2StreamConfigurationMap = kotlin.collections.MapsKt.build(createMapBuilder);
    }

    private final java.lang.Object readResolve() {
        return this.Camera2StreamConfigurationMap;
    }
}
