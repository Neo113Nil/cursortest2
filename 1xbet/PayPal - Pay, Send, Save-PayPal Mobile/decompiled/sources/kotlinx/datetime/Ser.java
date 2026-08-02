package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/datetime/Ser;", "Ljava/io/Externalizable;", "", "typeTag", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(ILjava/lang/Object;)V", "()V", "Ljava/io/ObjectOutput;", "out", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "in", "readExternal", "(Ljava/io/ObjectInput;)V", "readResolve", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Ser implements java.io.Externalizable {
    public static final int DATE_TAG = 2;
    public static final int DATE_TIME_TAG = 4;
    public static final int TIME_TAG = 3;
    public static final int UTC_OFFSET_TAG = 10;
    public static final int YEAR_MONTH_TAG = 11;
    private static final long serialVersionUID = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Object Camera2StreamConfigurationMap;

    public Ser(int i, java.lang.Object obj) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = obj;
    }

    public Ser() {
        this(0, null);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput out) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "");
        out.writeByte(this.getHighSpeedVideoSizes);
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoSizes;
        if (i == 2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            out.writeLong(((kotlinx.datetime.LocalDate) obj).getValue().toEpochDay());
            return;
        }
        if (i == 3) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            out.writeLong(((kotlinx.datetime.LocalTime) obj).toNanosecondOfDay());
            return;
        }
        if (i == 4) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            kotlinx.datetime.LocalDateTime localDateTime = (kotlinx.datetime.LocalDateTime) obj;
            out.writeLong(localDateTime.getDate().getValue().toEpochDay());
            out.writeLong(localDateTime.getTime().toNanosecondOfDay());
            return;
        }
        if (i == 10) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            out.writeInt(((kotlinx.datetime.UtcOffset) obj).getTotalSeconds());
        } else if (i == 11) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            out.writeLong(kotlinx.datetime.YearMonthJvmKt.toEpochMonths((kotlinx.datetime.YearMonth) obj));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown type tag: ");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(" for value: ");
            sb.append(obj);
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput in) {
        kotlinx.datetime.LocalDate localDate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(in, "");
        byte readByte = in.readByte();
        this.getHighSpeedVideoSizes = readByte;
        if (readByte == 2) {
            java.time.LocalDate ofEpochDay = java.time.LocalDate.ofEpochDay(in.readLong());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofEpochDay, "");
            localDate = new kotlinx.datetime.LocalDate(ofEpochDay);
        } else if (readByte == 3) {
            localDate = kotlinx.datetime.LocalTime.INSTANCE.fromNanosecondOfDay(in.readLong());
        } else if (readByte == 4) {
            java.time.LocalDate ofEpochDay2 = java.time.LocalDate.ofEpochDay(in.readLong());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofEpochDay2, "");
            localDate = new kotlinx.datetime.LocalDateTime(new kotlinx.datetime.LocalDate(ofEpochDay2), kotlinx.datetime.LocalTime.INSTANCE.fromNanosecondOfDay(in.readLong()));
        } else if (readByte == 10) {
            localDate = kotlinx.datetime.UtcOffsetJvmKt.UtcOffset$default(null, null, java.lang.Integer.valueOf(in.readInt()), 3, null);
        } else if (readByte == 11) {
            localDate = kotlinx.datetime.YearMonthJvmKt.fromEpochMonths(kotlinx.datetime.YearMonth.INSTANCE, in.readLong());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown type tag: ");
            sb.append(this.getHighSpeedVideoSizes);
            throw new java.io.IOException(sb.toString());
        }
        this.Camera2StreamConfigurationMap = localDate;
    }

    private final java.lang.Object readResolve() {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return obj;
    }
}
