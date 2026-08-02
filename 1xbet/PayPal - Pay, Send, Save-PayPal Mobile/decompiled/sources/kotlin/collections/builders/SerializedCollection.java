package kotlin.collections.builders;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "collection", "", "tag", "<init>", "(Ljava/util/Collection;I)V", "()V", "Ljava/io/ObjectOutput;", "output", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/util/Collection;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerializedCollection implements java.io.Externalizable {
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.Collection<?> getHighSpeedVideoFpsRangesFor;

    public SerializedCollection(java.util.Collection<?> collection, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        this.getHighSpeedVideoFpsRangesFor = collection;
        this.getHighSpeedVideoSizes = i;
    }

    public SerializedCollection() {
        this(kotlin.collections.CollectionsKt.emptyList(), 0);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput output) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        output.writeByte(this.getHighSpeedVideoSizes);
        output.writeInt(this.getHighSpeedVideoFpsRangesFor.size());
        java.util.Iterator<?> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput input) {
        java.util.List build;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        byte readByte = input.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported flags value: ");
            sb.append((int) readByte);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.io.InvalidObjectException(sb.toString());
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Illegal size value: ");
            sb2.append(readInt);
            sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.io.InvalidObjectException(sb2.toString());
        }
        int i2 = 0;
        if (i == 0) {
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(readInt);
            while (i2 < readInt) {
                createListBuilder.add(input.readObject());
                i2++;
            }
            build = kotlin.collections.CollectionsKt.build(createListBuilder);
        } else if (i == 1) {
            java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder(readInt);
            while (i2 < readInt) {
                createSetBuilder.add(input.readObject());
                i2++;
            }
            build = kotlin.collections.SetsKt.build(createSetBuilder);
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unsupported collection type tag: ");
            sb3.append(i);
            sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.io.InvalidObjectException(sb3.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = build;
    }

    private final java.lang.Object readResolve() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
