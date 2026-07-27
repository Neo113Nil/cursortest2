package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import com.facebook.login.LoginLogger;
import com.ironsource.C4561o2;
import com.ironsource.mediationsdk.d;
import io.ktor.http.LinkHeader;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecomposeScopeImpl.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u00107\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u000eJ\u001c\u0010:\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0010\u0018\u00010;2\u0006\u0010=\u001a\u00020\u000fJ\b\u0010>\u001a\u00020\u0010H\u0016J\u0010\u0010?\u001a\u00020@2\b\u0010\u0019\u001a\u0004\u0018\u00010/J\u0016\u0010A\u001a\u00020\u00122\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010CJ\u000e\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020/J\u0006\u0010F\u001a\u00020\u0010J\u0006\u0010G\u001a\u00020\u0010J\u0006\u0010H\u001a\u00020\u0010J\u000e\u0010I\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u000fJ\"\u0010J\u001a\u00020\u00102\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u001dR\u000e\u0010!\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R$\u0010#\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u001dR$\u0010&\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u001dR$\u0010)\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128@@BX\u0080\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u001dR\"\u0010,\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030.\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R$\u00102\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u001dR\u0011\u00105\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u0010\u0014¨\u0006K"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "block", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "", "canRecompose", "", "getCanRecompose", "()Z", "<set-?>", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "currentToken", "value", "defaultsInScope", "getDefaultsInScope", "setDefaultsInScope", "(Z)V", "defaultsInvalid", "getDefaultsInvalid", "setDefaultsInvalid", "flags", "isConditional", "requiresRecompose", "getRequiresRecompose", "setRequiresRecompose", "rereading", "getRereading", "setRereading", LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED, "getSkipped$runtime_release", "setSkipped", "trackedDependencies", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/DerivedState;", "", "trackedInstances", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "used", "getUsed", "setUsed", "valid", "getValid", "adoptedBy", "compose", "composer", "end", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "token", "invalidate", "invalidateForResult", "Landroidx/compose/runtime/InvalidationResult;", "isInvalidFor", d.k, "Landroidx/compose/runtime/collection/IdentityArraySet;", "recordRead", C4561o2.p, "release", "rereadTrackedInstances", "scopeSkipped", "start", "updateScope", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    private Anchor anchor;
    private Function2<? super Composer, ? super Integer, Unit> block;
    private CompositionImpl composition;
    private int currentToken;
    private int flags;
    private IdentityArrayMap<DerivedState<?>, Object> trackedDependencies;
    private IdentityArrayIntMap trackedInstances;

    public RecomposeScopeImpl(CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public final boolean getValid() {
        if (this.composition == null) {
            return false;
        }
        Anchor anchor = this.anchor;
        return anchor != null ? anchor.getValid() : false;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final void setUsed(boolean z) {
        if (z) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final void setDefaultsInScope(boolean z) {
        if (z) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final void setDefaultsInvalid(boolean z) {
        if (z) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final void setRequiresRecompose(boolean z) {
        if (z) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void compose(Composer composer) {
        Unit unit;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Function2<? super Composer, ? super Integer, Unit> function2 = this.block;
        if (function2 != null) {
            function2.invoke(composer, 1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final InvalidationResult invalidateForResult(Object value) {
        InvalidationResult invalidate;
        CompositionImpl compositionImpl = this.composition;
        return (compositionImpl == null || (invalidate = compositionImpl.invalidate(this, value)) == null) ? InvalidationResult.IGNORED : invalidate;
    }

    public final void release() {
        this.composition = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    public final void adoptedBy(CompositionImpl composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.composition = composition;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl != null) {
            compositionImpl.invalidate(this, null);
        }
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(Function2<? super Composer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z) {
        if (z) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    private final void setSkipped(boolean z) {
        if (z) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void start(int token) {
        this.currentToken = token;
        setSkipped(false);
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void recordRead(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (getRereading()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null) {
            identityArrayIntMap = new IdentityArrayIntMap();
            this.trackedInstances = identityArrayIntMap;
        }
        identityArrayIntMap.add(instance, this.currentToken);
        if (instance instanceof DerivedState) {
            IdentityArrayMap<DerivedState<?>, Object> identityArrayMap = this.trackedDependencies;
            if (identityArrayMap == null) {
                identityArrayMap = new IdentityArrayMap<>(0, 1, null);
                this.trackedDependencies = identityArrayMap;
            }
            identityArrayMap.set(instance, ((DerivedState) instance).getCurrentValue());
        }
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInvalidFor(IdentityArraySet<Object> instances) {
        IdentityArrayMap<DerivedState<?>, Object> identityArrayMap;
        if (instances != null && (identityArrayMap = this.trackedDependencies) != 0 && instances.isNotEmpty()) {
            IdentityArraySet<Object> identityArraySet = instances;
            if ((identityArraySet instanceof Collection) && identityArraySet.isEmpty()) {
                return false;
            }
            for (Object obj : identityArraySet) {
                if ((obj instanceof DerivedState) && Intrinsics.areEqual(identityArrayMap.get(obj), ((DerivedState) obj).getCurrentValue())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void rereadTrackedInstances() {
        IdentityArrayIntMap identityArrayIntMap;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null || (identityArrayIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            int size = identityArrayIntMap.getSize();
            for (int i = 0; i < size; i++) {
                Object obj = identityArrayIntMap.getKeys()[i];
                if (obj != null) {
                    int i2 = identityArrayIntMap.getValues()[i];
                    compositionImpl.recordReadOf(obj);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
            }
        } finally {
            setRereading(false);
        }
    }

    public final Function1<Composition, Unit> end(final int token) {
        final IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        int size = identityArrayIntMap.getSize();
        for (int i = 0; i < size; i++) {
            if (identityArrayIntMap.getKeys()[i] == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            if (identityArrayIntMap.getValues()[i] != token) {
                return new Function1<Composition, Unit>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Composition composition) {
                        invoke2(composition);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Composition composition) {
                        int i2;
                        IdentityArrayIntMap identityArrayIntMap2;
                        IdentityArrayMap identityArrayMap;
                        Intrinsics.checkNotNullParameter(composition, "composition");
                        i2 = RecomposeScopeImpl.this.currentToken;
                        if (i2 == token) {
                            IdentityArrayIntMap identityArrayIntMap3 = identityArrayIntMap;
                            identityArrayIntMap2 = RecomposeScopeImpl.this.trackedInstances;
                            if (Intrinsics.areEqual(identityArrayIntMap3, identityArrayIntMap2) && (composition instanceof CompositionImpl)) {
                                IdentityArrayIntMap identityArrayIntMap4 = identityArrayIntMap;
                                int i3 = token;
                                RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
                                int size2 = identityArrayIntMap4.getSize();
                                int i4 = 0;
                                for (int i5 = 0; i5 < size2; i5++) {
                                    Object obj = identityArrayIntMap4.getKeys()[i5];
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    int i6 = identityArrayIntMap4.getValues()[i5];
                                    boolean z = i6 != i3;
                                    if (z) {
                                        CompositionImpl compositionImpl = (CompositionImpl) composition;
                                        compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                                        DerivedState<?> derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                                        if (derivedState != null) {
                                            compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                                            identityArrayMap = recomposeScopeImpl.trackedDependencies;
                                            if (identityArrayMap != null) {
                                                identityArrayMap.remove(derivedState);
                                                if (identityArrayMap.getSize() == 0) {
                                                    recomposeScopeImpl.trackedDependencies = null;
                                                }
                                            }
                                        }
                                    }
                                    if (!z) {
                                        if (i4 != i5) {
                                            identityArrayIntMap4.getKeys()[i4] = obj;
                                            identityArrayIntMap4.getValues()[i4] = i6;
                                        }
                                        i4++;
                                    }
                                }
                                int size3 = identityArrayIntMap4.getSize();
                                for (int i7 = i4; i7 < size3; i7++) {
                                    identityArrayIntMap4.getKeys()[i7] = null;
                                }
                                identityArrayIntMap4.setSize(i4);
                                if (identityArrayIntMap.getSize() == 0) {
                                    RecomposeScopeImpl.this.trackedInstances = null;
                                }
                            }
                        }
                    }
                };
            }
        }
        return null;
    }
}
