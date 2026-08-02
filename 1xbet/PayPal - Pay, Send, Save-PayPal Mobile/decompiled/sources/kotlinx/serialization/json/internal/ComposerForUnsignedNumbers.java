package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "", "v", "", "print", "(I)V", "", "(J)V", "", "(B)V", "", "(S)V", "Camera2StreamConfigurationMap", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposerForUnsignedNumbers extends kotlinx.serialization.json.internal.Composer {
    private final boolean Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(kotlinx.serialization.json.internal.InternalJsonWriter internalJsonWriter, boolean z) {
        super(internalJsonWriter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonWriter, "");
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void print(int v) {
        boolean z = this.Camera2StreamConfigurationMap;
        java.lang.String unsignedString = java.lang.Integer.toUnsignedString(kotlin.UInt.m23470constructorimpl(v));
        if (z) {
            printQuoted(unsignedString);
        } else {
            print(unsignedString);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void print(long v) {
        boolean z = this.Camera2StreamConfigurationMap;
        java.lang.String unsignedString = java.lang.Long.toUnsignedString(kotlin.ULong.m23494constructorimpl(v));
        if (z) {
            printQuoted(unsignedString);
        } else {
            print(unsignedString);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void print(byte v) {
        boolean z = this.Camera2StreamConfigurationMap;
        java.lang.String m23450toStringimpl = kotlin.UByte.m23450toStringimpl(kotlin.UByte.m23446constructorimpl(v));
        if (z) {
            printQuoted(m23450toStringimpl);
        } else {
            print(m23450toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void print(short v) {
        boolean z = this.Camera2StreamConfigurationMap;
        java.lang.String m23522toStringimpl = kotlin.UShort.m23522toStringimpl(kotlin.UShort.m23518constructorimpl(v));
        if (z) {
            printQuoted(m23522toStringimpl);
        } else {
            print(m23522toStringimpl);
        }
    }
}
