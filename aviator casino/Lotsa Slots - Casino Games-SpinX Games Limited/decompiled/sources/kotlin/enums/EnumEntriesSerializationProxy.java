package kotlin.enums;

/* compiled from: EnumEntriesSerializationProxy.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \r*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\rB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "<init>", "([Ljava/lang/Enum;)V", "c", "Ljava/lang/Class;", "readResolve", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnumEntriesSerializationProxy<E extends java.lang.Enum<E>> implements java.io.Serializable {
    private static final kotlin.enums.EnumEntriesSerializationProxy.Companion Companion = new kotlin.enums.EnumEntriesSerializationProxy.Companion(null);
    private static final long serialVersionUID = 0;
    private final java.lang.Class<E> c;

    public EnumEntriesSerializationProxy(E[] entries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "entries");
        java.lang.Class<E> cls = (java.lang.Class<E>) entries.getClass().getComponentType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
        this.c = cls;
    }

    /* compiled from: EnumEntriesSerializationProxy.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy$Companion;", "", "<init>", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final java.lang.Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return kotlin.enums.EnumEntriesKt.enumEntries(enumConstants);
    }
}
