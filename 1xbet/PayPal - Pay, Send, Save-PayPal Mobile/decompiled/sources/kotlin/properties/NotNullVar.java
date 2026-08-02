package kotlin.properties;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ.\u0010\r\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlin/properties/NotNullVar;", "", "T", "Lkotlin/properties/ReadWriteProperty;", "<init>", "()V", "p0", "Lkotlin/reflect/KProperty;", "p1", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "p2", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class NotNullVar<T> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private T getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public final T getValue(java.lang.Object p0, kotlin.reflect.KProperty<?> p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        T t = this.getHighSpeedVideoFpsRangesFor;
        if (t != null) {
            return t;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Property ");
        sb.append(p1.getName());
        sb.append(" should be initialized before get.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(java.lang.Object p0, kotlin.reflect.KProperty<?> p1, T p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        this.getHighSpeedVideoFpsRangesFor = p2;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotNullProperty(");
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("value=");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            str = sb2.toString();
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
