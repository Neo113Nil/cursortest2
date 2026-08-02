package androidx.compose.ui.input.pointer;

import D1.AbstractC2794c0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.F;
import x1.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "LD1/c0;", "Lx1/S;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends AbstractC2794c0<S> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40473a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f40474b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f40475c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<F, d<? super Unit>, Object> f40476d;

    public SuspendPointerInputElement() {
        throw null;
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, Function2 function2, int i11) {
        obj = (i11 & 1) != 0 ? null : obj;
        obj2 = (i11 & 2) != 0 ? null : obj2;
        objArr = (i11 & 4) != 0 ? null : objArr;
        this.f40473a = obj;
        this.f40474b = obj2;
        this.f40475c = objArr;
        this.f40476d = function2;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final S getF41119a() {
        return new S(this.f40473a, this.f40474b, this.f40475c, this.f40476d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Intrinsics.d(this.f40473a, suspendPointerInputElement.f40473a) || !Intrinsics.d(this.f40474b, suspendPointerInputElement.f40474b)) {
            return false;
        }
        Object[] objArr = this.f40475c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f40475c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f40475c != null) {
            return false;
        }
        return this.f40476d == suspendPointerInputElement.f40476d;
    }

    public final int hashCode() {
        Object obj = this.f40473a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f40474b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f40475c;
        return this.f40476d.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(S s11) {
        s11.N1(this.f40473a, this.f40474b, this.f40475c, this.f40476d);
    }
}
