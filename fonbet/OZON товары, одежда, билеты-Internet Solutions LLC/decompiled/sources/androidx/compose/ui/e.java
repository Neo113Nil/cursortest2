package androidx.compose.ui;

import D1.AbstractC2810k0;
import D1.C2809k;
import D1.InterfaceC2807j;
import D1.t0;
import De.C2862e;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.D0;
import xe.M;
import xe.N;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: c0, reason: collision with root package name */
    @NotNull
    public static final a f40358c0 = a.f40359a;

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40359a = new a();

        @Override // androidx.compose.ui.e
        @NotNull
        public final e l0(@NotNull e eVar) {
            return eVar;
        }

        @Override // androidx.compose.ui.e
        public final <R> R t(R r11, @NotNull Function2<? super R, ? super b, ? extends R> function2) {
            return r11;
        }

        @NotNull
        public final String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.e
        public final boolean w(@NotNull Function1<? super b, Boolean> function1) {
            return true;
        }
    }

    public interface b extends e {
        @Override // androidx.compose.ui.e
        default <R> R t(R r11, @NotNull Function2<? super R, ? super b, ? extends R> function2) {
            return function2.invoke(r11, this);
        }

        @Override // androidx.compose.ui.e
        default boolean w(@NotNull Function1<? super b, Boolean> function1) {
            return function1.invoke(this).booleanValue();
        }
    }

    public static abstract class c implements InterfaceC2807j {
        private c child;
        private AbstractC2810k0 coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private t0 ownerScope;
        private c parent;
        private M scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;

        @NotNull
        private c node = this;
        private int aggregateChildKindSet = -1;

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final c getChild$ui_release() {
            return this.child;
        }

        public final AbstractC2810k0 getCoordinator$ui_release() {
            return this.coordinator;
        }

        @NotNull
        public final M getCoroutineScope() {
            M m11 = this.scope;
            if (m11 != null) {
                return m11;
            }
            C2862e a11 = N.a(((AndroidComposeView) C2809k.g(this)).getF40542f().plus(new D0((B0) ((AndroidComposeView) C2809k.g(this)).getF40542f().get(B0.f105374o0))));
            this.scope = a11;
            return a11;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        @Override // D1.InterfaceC2807j
        @NotNull
        public final c getNode() {
            return this.node;
        }

        public final t0 getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final c getParent$ui_release() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        public boolean m0() {
            return isAttached();
        }

        public void markAsAttached$ui_release() {
            if (this.isAttached) {
                A1.a.b("node attached multiple times");
                throw null;
            }
            if (!(this.coordinator != null)) {
                A1.a.b("attach invoked on a node without a coordinator");
                throw null;
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                A1.a.b("Cannot detach a node that is not attached");
                throw null;
            }
            if (this.onAttachRunExpected) {
                A1.a.b("Must run runAttachLifecycle() before markAsDetached()");
                throw null;
            }
            if (this.onDetachRunExpected) {
                A1.a.b("Must run runDetachLifecycle() before markAsDetached()");
                throw null;
            }
            this.isAttached = false;
            M m11 = this.scope;
            if (m11 != null) {
                N.c(m11, new e1.e("The Modifier.Node was detached"));
                this.scope = null;
            }
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui_release() {
            if (this.isAttached) {
                onReset();
            } else {
                A1.a.b("reset() called on an unattached node");
                throw null;
            }
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                A1.a.b("Must run markAsAttached() prior to runAttachLifecycle");
                throw null;
            }
            if (!this.onAttachRunExpected) {
                A1.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
                throw null;
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                A1.a.b("node detached multiple times");
                throw null;
            }
            if (this.coordinator == null) {
                A1.a.b("detach invoked on a node without a coordinator");
                throw null;
            }
            if (!this.onDetachRunExpected) {
                A1.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
                throw null;
            }
            this.onDetachRunExpected = false;
            onDetach();
        }

        public final void setAggregateChildKindSet$ui_release(int i11) {
            this.aggregateChildKindSet = i11;
        }

        public void setAsDelegateTo$ui_release(@NotNull c cVar) {
            this.node = cVar;
        }

        public final void setChild$ui_release(c cVar) {
            this.child = cVar;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z11) {
            this.insertedNodeAwaitingAttachForInvalidation = z11;
        }

        public final void setKindSet$ui_release(int i11) {
            this.kindSet = i11;
        }

        public final void setOwnerScope$ui_release(t0 t0Var) {
            this.ownerScope = t0Var;
        }

        public final void setParent$ui_release(c cVar) {
            this.parent = cVar;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z11) {
            this.updatedNodeAwaitingAttachForInvalidation = z11;
        }

        public final void sideEffect(@NotNull Function0<Unit> function0) {
            ((AndroidComposeView) C2809k.g(this)).J0(function0);
        }

        public void updateCoordinator$ui_release(AbstractC2810k0 abstractC2810k0) {
            this.coordinator = abstractC2810k0;
        }
    }

    @NotNull
    default e l0(@NotNull e eVar) {
        return eVar == a.f40359a ? this : new androidx.compose.ui.a(this, eVar);
    }

    <R> R t(R r11, @NotNull Function2<? super R, ? super b, ? extends R> function2);

    boolean w(@NotNull Function1<? super b, Boolean> function1);
}
