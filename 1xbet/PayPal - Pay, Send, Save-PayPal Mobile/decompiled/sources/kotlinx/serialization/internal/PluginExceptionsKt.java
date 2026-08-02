package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "seen", "goldenMask", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "throwMissingFieldException", "(IILkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "seenArray", "goldenMaskArray", "throwArrayMissingFieldException", "([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PluginExceptionsKt {
    @kotlinx.serialization.InternalSerializationApi
    public static final void throwMissingFieldException(int i, int i2, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.getElementName(i4));
            }
            i3 >>>= 1;
        }
        throw new kotlinx.serialization.MissingFieldException(arrayList, serialDescriptor.getSerialName());
    }

    @kotlinx.serialization.InternalSerializationApi
    public static final void throwArrayMissingFieldException(int[] iArr, int[] iArr2, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(serialDescriptor.getElementName((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new kotlinx.serialization.MissingFieldException(arrayList, serialDescriptor.getSerialName());
    }
}
