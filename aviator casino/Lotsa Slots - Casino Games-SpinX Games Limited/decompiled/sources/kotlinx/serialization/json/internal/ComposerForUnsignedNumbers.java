package kotlinx.serialization.json.internal;

/* compiled from: Composers.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "forceQuoting", "", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "print", "", "v", "", "", "", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerForUnsignedNumbers extends kotlinx.serialization.json.internal.Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(kotlinx.serialization.json.internal.InternalJsonWriter writer, boolean z) {
        super(writer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int v) {
        java.lang.String m10868m;
        java.lang.String m10868m2;
        boolean z = this.forceQuoting;
        int m10896constructorimpl = kotlin.UInt.m10896constructorimpl(v);
        if (z) {
            m10868m2 = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(m10896constructorimpl, 10);
            printQuoted(m10868m2);
        } else {
            m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(m10896constructorimpl, 10);
            print(m10868m);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long v) {
        java.lang.String m$2;
        java.lang.String m$22;
        boolean z = this.forceQuoting;
        long m10975constructorimpl = kotlin.ULong.m10975constructorimpl(v);
        if (z) {
            m$22 = kotlin.UByte$$ExternalSyntheticBackport0.m$2(m10975constructorimpl, 10);
            printQuoted(m$22);
        } else {
            m$2 = kotlin.UByte$$ExternalSyntheticBackport0.m$2(m10975constructorimpl, 10);
            print(m$2);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte v) {
        boolean z = this.forceQuoting;
        java.lang.String m10860toStringimpl = kotlin.UByte.m10860toStringimpl(kotlin.UByte.m10816constructorimpl(v));
        if (z) {
            printQuoted(m10860toStringimpl);
        } else {
            print(m10860toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short v) {
        boolean z = this.forceQuoting;
        java.lang.String m11126toStringimpl = kotlin.UShort.m11126toStringimpl(kotlin.UShort.m11082constructorimpl(v));
        if (z) {
            printQuoted(m11126toStringimpl);
        } else {
            print(m11126toStringimpl);
        }
    }
}
