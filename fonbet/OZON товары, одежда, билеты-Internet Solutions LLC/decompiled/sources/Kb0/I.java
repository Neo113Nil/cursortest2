package Kb0;

import Sc.InterfaceC4008j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import pf0.AbstractC8919b;
import pf0.AbstractC8922e;

/* loaded from: classes3.dex */
public final class I extends pf0.i {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f15460a;

    /* renamed from: b, reason: collision with root package name */
    private final a f15461b;

    public static final class a extends AbstractC8919b.c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC8919b.AbstractC1361b.e f15462a = AbstractC8919b.AbstractC1361b.e.f80507b;

        /* renamed from: b, reason: collision with root package name */
        private final String f15463b = "14.8.1";

        a() {
        }

        @Override // pf0.AbstractC8919b.c
        public final AbstractC8919b.AbstractC1361b getName() {
            return this.f15462a;
        }

        @Override // pf0.AbstractC8919b.c
        public final String getVersion() {
            return this.f15463b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    I(C3487w c3487w, AbstractC8922e abstractC8922e) {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = c3487w.f15758k;
        AbstractC8922e[] elements = {interfaceC4008j.getValue(), abstractC8922e};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f15460a = C7705l.B(elements);
        this.f15461b = new a();
    }

    @Override // pf0.i
    public final AbstractC8919b getConsumer() {
        return this.f15461b;
    }

    @Override // pf0.i
    public final List<AbstractC8922e> getInterceptors() {
        return this.f15460a;
    }
}
