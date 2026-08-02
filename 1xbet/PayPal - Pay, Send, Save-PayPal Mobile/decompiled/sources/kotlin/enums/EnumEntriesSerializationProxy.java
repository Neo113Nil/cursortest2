package kotlin.enums;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0010*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0010B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", "", "E", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/lang/Class;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Class;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EnumEntriesSerializationProxy<E extends java.lang.Enum<E>> implements java.io.Serializable {
    private static final kotlin.enums.EnumEntriesSerializationProxy.Companion Companion = new kotlin.enums.EnumEntriesSerializationProxy.Companion(null);
    private static final long serialVersionUID = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Class<E> Camera2StreamConfigurationMap;

    public EnumEntriesSerializationProxy(E[] eArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eArr, "");
        java.lang.Class<E> cls = (java.lang.Class<E>) eArr.getClass().getComponentType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
        this.Camera2StreamConfigurationMap = cls;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final java.lang.Object readResolve() {
        E[] enumConstants = this.Camera2StreamConfigurationMap.getEnumConstants();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enumConstants, "");
        return kotlin.enums.EnumEntriesKt.enumEntries(enumConstants);
    }
}
