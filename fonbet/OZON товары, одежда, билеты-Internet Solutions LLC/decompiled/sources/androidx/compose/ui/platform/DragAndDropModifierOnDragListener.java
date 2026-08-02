package androidx.compose.ui.platform;

import D1.AbstractC2794c0;
import android.view.DragEvent;
import android.view.View;
import androidx.collection.AbstractC5139h;
import androidx.collection.C5133b;
import fd.InterfaceC6511n;
import h1.C6769b;
import h1.C6773f;
import h1.C6777j;
import h1.InterfaceC6770c;
import h1.InterfaceC6771d;
import h1.InterfaceC6776i;
import java.util.Iterator;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements View.OnDragListener, InterfaceC6770c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<C6777j, C7464j, Function1<? super InterfaceC8412e, Unit>, Boolean> f40627a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6773f f40628b = new C6773f(a.f40631b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5133b<InterfaceC6771d> f40629c = new C5133b<>(0);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final DragAndDropModifierOnDragListener$modifier$1 f40630d = new AbstractC2794c0<C6773f>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // D1.AbstractC2794c0
        /* renamed from: create */
        public final C6773f getF41119a() {
            C6773f c6773f;
            c6773f = DragAndDropModifierOnDragListener.this.f40628b;
            return c6773f;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            C6773f c6773f;
            c6773f = DragAndDropModifierOnDragListener.this.f40628b;
            return c6773f.hashCode();
        }

        @Override // D1.AbstractC2794c0
        public final /* bridge */ /* synthetic */ void update(C6773f c6773f) {
        }
    };

    static final class a extends AbstractC7737t implements Function1<C6769b, InterfaceC6776i> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40631b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ InterfaceC6776i invoke(C6769b c6769b) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1] */
    public DragAndDropModifierOnDragListener(@NotNull InterfaceC6511n<? super C6777j, ? super C7464j, ? super Function1<? super InterfaceC8412e, Unit>, Boolean> interfaceC6511n) {
        this.f40627a = interfaceC6511n;
    }

    @Override // h1.InterfaceC6770c
    public final void a(@NotNull C6773f c6773f) {
        this.f40629c.add(c6773f);
    }

    @Override // h1.InterfaceC6770c
    public final boolean b(@NotNull C6773f c6773f) {
        return this.f40629c.contains(c6773f);
    }

    @NotNull
    public final DragAndDropModifierOnDragListener$modifier$1 d() {
        return this.f40630d;
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(@NotNull View view, @NotNull DragEvent dragEvent) {
        C6769b c6769b = new C6769b(dragEvent);
        int action = dragEvent.getAction();
        C6773f c6773f = this.f40628b;
        switch (action) {
            case 1:
                boolean I12 = c6773f.I1(c6769b);
                Iterator<InterfaceC6771d> it = this.f40629c.iterator();
                while (true) {
                    AbstractC5139h abstractC5139h = (AbstractC5139h) it;
                    if (!abstractC5139h.hasNext()) {
                        break;
                    } else {
                        ((InterfaceC6771d) abstractC5139h.next()).x0(c6769b);
                    }
                }
            case 2:
                c6773f.h1(c6769b);
                break;
            case 4:
                c6773f.i1(c6769b);
                break;
            case 5:
                c6773f.a1(c6769b);
                break;
            case 6:
                c6773f.Q0(c6769b);
                break;
        }
        return false;
    }
}
