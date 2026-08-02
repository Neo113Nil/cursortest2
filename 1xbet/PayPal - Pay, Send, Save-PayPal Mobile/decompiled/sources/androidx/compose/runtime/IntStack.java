package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001f\u001a\u00020\u00078Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "<init>", "()V", "", "Camera2StreamConfigurationMap", "()[I", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.adjust.sdk.Constants.PUSH, "(I)V", "pop", "()I", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "peekOr", "(I)I", "peek", "peek2", "index", "", "isEmpty", "()Z", "isNotEmpty", "clear", "indexOf", "slots", "[I", "tos", com.visa.cbp.getEncExpo.warmup, "getSize", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntStack {
    public static final int $stable = 8;
    public int[] slots = new int[10];
    public int tos;

    /* renamed from: getSize, reason: from getter */
    public final int getTos() {
        return this.tos;
    }

    private final int[] Camera2StreamConfigurationMap() {
        int[] iArr = this.slots;
        int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        this.slots = copyOf;
        return copyOf;
    }

    public final void push(int value) {
        int[] iArr = this.slots;
        if (this.tos >= iArr.length) {
            iArr = Camera2StreamConfigurationMap();
        }
        int i = this.tos;
        this.tos = i + 1;
        iArr[i] = value;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i = this.tos - 1;
        this.tos = i;
        return iArr[i];
    }

    public final int peekOr(int r2) {
        int i = this.tos - 1;
        return i >= 0 ? this.slots[i] : r2;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek2() {
        return this.slots[this.tos - 2];
    }

    public final int peek(int index) {
        return this.slots[index];
    }

    public final boolean isEmpty() {
        return this.tos == 0;
    }

    public final boolean isNotEmpty() {
        return this.tos != 0;
    }

    public final void clear() {
        this.tos = 0;
    }

    public final int indexOf(int value) {
        int[] iArr = this.slots;
        int min = java.lang.Math.min(iArr.length, this.tos);
        for (int i = 0; i < min; i++) {
            if (iArr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
