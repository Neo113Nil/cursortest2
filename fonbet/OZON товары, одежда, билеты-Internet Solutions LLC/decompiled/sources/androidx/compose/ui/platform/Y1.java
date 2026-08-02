package androidx.compose.ui.platform;

import U7.C4056a;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C5320h0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public interface Y1 {

    public static final class a implements Y1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f40785a = new a();

        /* renamed from: androidx.compose.ui.platform.Y1$a$a, reason: collision with other inner class name */
        static final class C0745a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5228a f40786b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f40787c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0745a(AbstractC5228a abstractC5228a, b bVar) {
                super(0);
                this.f40786b = abstractC5228a;
                this.f40787c = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f40786b.removeOnAttachStateChangeListener(this.f40787c);
                return Unit.f71690a;
            }
        }

        public static final class b implements View.OnAttachStateChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5228a f40788a;

            b(AbstractC5228a abstractC5228a) {
                this.f40788a = abstractC5228a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(@NotNull View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(@NotNull View view) {
                this.f40788a.disposeComposition();
            }
        }

        @Override // androidx.compose.ui.platform.Y1
        @NotNull
        public final Function0<Unit> a(@NotNull AbstractC5228a abstractC5228a) {
            b bVar = new b(abstractC5228a);
            abstractC5228a.addOnAttachStateChangeListener(bVar);
            return new C0745a(abstractC5228a, bVar);
        }
    }

    public static final class b implements Y1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f40789a = new b();

        static final class a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5228a f40790b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0746b f40791c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C4056a f40792d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC5228a abstractC5228a, ViewOnAttachStateChangeListenerC0746b viewOnAttachStateChangeListenerC0746b, C4056a c4056a) {
                super(0);
                this.f40790b = abstractC5228a;
                this.f40791c = viewOnAttachStateChangeListenerC0746b;
                this.f40792d = c4056a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                AbstractC5228a abstractC5228a = this.f40790b;
                abstractC5228a.removeOnAttachStateChangeListener(this.f40791c);
                N2.a.b(abstractC5228a, this.f40792d);
                return Unit.f71690a;
            }
        }

        /* renamed from: androidx.compose.ui.platform.Y1$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0746b implements View.OnAttachStateChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5228a f40793a;

            ViewOnAttachStateChangeListenerC0746b(AbstractC5228a abstractC5228a) {
                this.f40793a = abstractC5228a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(@NotNull View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(@NotNull View view) {
                boolean z11;
                AbstractC5228a abstractC5228a = this.f40793a;
                Intrinsics.checkNotNullParameter(abstractC5228a, "<this>");
                Iterator<ViewParent> it = C5320h0.b(abstractC5228a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object obj = (ViewParent) it.next();
                    if (obj instanceof View) {
                        View view2 = (View) obj;
                        Intrinsics.checkNotNullParameter(view2, "<this>");
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            z11 = true;
                            break;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                abstractC5228a.disposeComposition();
            }
        }

        @Override // androidx.compose.ui.platform.Y1
        @NotNull
        public final Function0<Unit> a(@NotNull AbstractC5228a abstractC5228a) {
            ViewOnAttachStateChangeListenerC0746b viewOnAttachStateChangeListenerC0746b = new ViewOnAttachStateChangeListenerC0746b(abstractC5228a);
            abstractC5228a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0746b);
            C4056a c4056a = new C4056a();
            N2.a.a(abstractC5228a, c4056a);
            return new a(abstractC5228a, viewOnAttachStateChangeListenerC0746b, c4056a);
        }
    }

    public static final class c implements Y1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f40794a = new c();

        static final class a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5228a f40795b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0747c f40796c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC5228a abstractC5228a, ViewOnAttachStateChangeListenerC0747c viewOnAttachStateChangeListenerC0747c) {
                super(0);
                this.f40795b = abstractC5228a;
                this.f40796c = viewOnAttachStateChangeListenerC0747c;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f40795b.removeOnAttachStateChangeListener(this.f40796c);
                return Unit.f71690a;
            }
        }

        static final class b extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.M<Function0<Unit>> f40797b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.M<Function0<Unit>> m11) {
                super(0);
                this.f40797b = m11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f40797b.f71787a.invoke();
                return Unit.f71690a;
            }
        }

        /* renamed from: androidx.compose.ui.platform.Y1$c$c, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0747c implements View.OnAttachStateChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5228a f40798a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.M<Function0<Unit>> f40799b;

            ViewOnAttachStateChangeListenerC0747c(AbstractC5228a abstractC5228a, kotlin.jvm.internal.M<Function0<Unit>> m11) {
                this.f40798a = abstractC5228a;
                this.f40799b = m11;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, kotlin.jvm.functions.Function0] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(@NotNull View view) {
                AbstractC5228a abstractC5228a = this.f40798a;
                androidx.lifecycle.J a11 = androidx.lifecycle.C0.a(abstractC5228a);
                if (a11 != null) {
                    this.f40799b.f71787a = b2.a(abstractC5228a, a11.getLifecycle());
                    abstractC5228a.removeOnAttachStateChangeListener(this);
                } else {
                    A1.a.c("View tree for " + abstractC5228a + " has no ViewTreeLifecycleOwner");
                    throw null;
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(@NotNull View view) {
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.Y1$c$a] */
        @Override // androidx.compose.ui.platform.Y1
        @NotNull
        public final Function0<Unit> a(@NotNull AbstractC5228a abstractC5228a) {
            if (!abstractC5228a.isAttachedToWindow()) {
                kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
                ViewOnAttachStateChangeListenerC0747c viewOnAttachStateChangeListenerC0747c = new ViewOnAttachStateChangeListenerC0747c(abstractC5228a, m11);
                abstractC5228a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0747c);
                m11.f71787a = new a(abstractC5228a, viewOnAttachStateChangeListenerC0747c);
                return new b(m11);
            }
            androidx.lifecycle.J a11 = androidx.lifecycle.C0.a(abstractC5228a);
            if (a11 != null) {
                return b2.a(abstractC5228a, a11.getLifecycle());
            }
            A1.a.c("View tree for " + abstractC5228a + " has no ViewTreeLifecycleOwner");
            throw null;
        }
    }

    @NotNull
    Function0<Unit> a(@NotNull AbstractC5228a abstractC5228a);
}
