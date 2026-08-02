package org.betup.ui.dialogs.offer;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.vk.sdk.api.model.VKApiUserFull;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty0;
import kotlinx.serialization.Transient;
import org.betup.ui.dialogs.offer.OfferFragment;
import org.betup.ui.dialogs.offer.OfferItemContent;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferFragment.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@BX\u0087.¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0004 !\"#¨\u0006$"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContentImpl;", "Lorg/betup/ui/dialogs/offer/OfferItemContent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "builderId", "", "getBuilderId$annotations", "getBuilderId", "()Ljava/lang/String;", "setBuilderId", "(Ljava/lang/String;)V", "value", "Lkotlin/Function0;", "", "onDismissDialog", "getOnDismissDialog$annotations", "getOnDismissDialog", "()Lkotlin/jvm/functions/Function0;", "viewId", "", "getViewId", "()I", "init", "Landroidx/viewbinding/ViewBinding;", "builder", "Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;", "context", "Landroid/content/Context;", "parentLayoutId", "scaleXRatio", "", "scaleYRatio", "Lorg/betup/ui/dialogs/offer/BetcoinContent;", "Lorg/betup/ui/dialogs/offer/ButtonContent;", "Lorg/betup/ui/dialogs/offer/PriceContent;", "Lorg/betup/ui/dialogs/offer/TimerContent;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OfferItemContentImpl implements OfferItemContent {
    public static final int $stable = 8;
    public String builderId;
    private Function0<Unit> onDismissDialog;
    private final int viewId;

    public /* synthetic */ OfferItemContentImpl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Transient
    public static /* synthetic */ void getBuilderId$annotations() {
    }

    @Transient
    public static /* synthetic */ void getOnDismissDialog$annotations() {
    }

    private OfferItemContentImpl() {
        this.viewId = View.generateViewId();
    }

    public final String getBuilderId() {
        String str = this.builderId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("builderId");
        return null;
    }

    public final void setBuilderId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.builderId = str;
    }

    public final Function0<Unit> getOnDismissDialog() {
        Function0<Unit> function0 = this.onDismissDialog;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onDismissDialog");
        return null;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public final int getViewId() {
        return this.viewId;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public ViewBinding init(OfferFragment.Builder builder, Context context, int parentLayoutId, float scaleXRatio, float scaleYRatio, Function0<Unit> onDismissDialog) {
        Object obj;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onDismissDialog, "onDismissDialog");
        setBuilderId(builder.getId());
        this.onDismissDialog = onDismissDialog;
        ViewBinding viewBinding = viewBinding(context);
        viewBinding.getRoot().setId(this.viewId);
        View root = viewBinding.getRoot();
        root.setScaleX(scaleXRatio);
        root.setScaleY(scaleYRatio);
        View root2 = viewBinding.getRoot();
        final ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        OfferItemContent.LayoutParams.Margins margins = getLayoutParams().getMargins();
        layoutParams.setMargins((int) (margins.getStart() * scaleXRatio), (int) (margins.getTop() * scaleYRatio), (int) (margins.getEnd() * scaleXRatio), (int) (margins.getBottom() * scaleYRatio));
        final OfferItemContent.LayoutParams.Constraints constraints = getLayoutParams().getConstraints();
        layoutParams.verticalBias = constraints.getVerticalBias();
        layoutParams.horizontalBias = constraints.getHorizontalBias();
        for (Map.Entry entry : MapsKt.mapOf(TuplesKt.to(new PropertyReference0Impl(constraints) { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$init$2$2$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((OfferItemContent.LayoutParams.Constraints) this.receiver).getStartToStartId();
            }
        }, new Function1() { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit init$lambda$15$lambda$14$lambda$2;
                init$lambda$15$lambda$14$lambda$2 = OfferItemContentImpl.init$lambda$15$lambda$14$lambda$2(ConstraintLayout.LayoutParams.this, ((Integer) obj2).intValue());
                return init$lambda$15$lambda$14$lambda$2;
            }
        }), TuplesKt.to(new PropertyReference0Impl(constraints) { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$init$2$2$3
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((OfferItemContent.LayoutParams.Constraints) this.receiver).getEndToEndId();
            }
        }, new Function1() { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit init$lambda$15$lambda$14$lambda$3;
                init$lambda$15$lambda$14$lambda$3 = OfferItemContentImpl.init$lambda$15$lambda$14$lambda$3(ConstraintLayout.LayoutParams.this, ((Integer) obj2).intValue());
                return init$lambda$15$lambda$14$lambda$3;
            }
        }), TuplesKt.to(new PropertyReference0Impl(constraints) { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$init$2$2$5
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((OfferItemContent.LayoutParams.Constraints) this.receiver).getTopToTopId();
            }
        }, new Function1() { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit init$lambda$15$lambda$14$lambda$4;
                init$lambda$15$lambda$14$lambda$4 = OfferItemContentImpl.init$lambda$15$lambda$14$lambda$4(ConstraintLayout.LayoutParams.this, ((Integer) obj2).intValue());
                return init$lambda$15$lambda$14$lambda$4;
            }
        }), TuplesKt.to(new PropertyReference0Impl(constraints) { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$init$2$2$7
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((OfferItemContent.LayoutParams.Constraints) this.receiver).getBottomToBottomId();
            }
        }, new Function1() { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit init$lambda$15$lambda$14$lambda$5;
                init$lambda$15$lambda$14$lambda$5 = OfferItemContentImpl.init$lambda$15$lambda$14$lambda$5(ConstraintLayout.LayoutParams.this, ((Integer) obj2).intValue());
                return init$lambda$15$lambda$14$lambda$5;
            }
        }), TuplesKt.to(new PropertyReference0Impl(constraints) { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$init$2$2$9
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((OfferItemContent.LayoutParams.Constraints) this.receiver).getStartToEndId();
            }
        }, new Function1() { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit init$lambda$15$lambda$14$lambda$6;
                init$lambda$15$lambda$14$lambda$6 = OfferItemContentImpl.init$lambda$15$lambda$14$lambda$6(ConstraintLayout.LayoutParams.this, ((Integer) obj2).intValue());
                return init$lambda$15$lambda$14$lambda$6;
            }
        }), TuplesKt.to(new PropertyReference0Impl(constraints) { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$init$2$2$11
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((OfferItemContent.LayoutParams.Constraints) this.receiver).getEndToStartId();
            }
        }, new Function1() { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit init$lambda$15$lambda$14$lambda$7;
                init$lambda$15$lambda$14$lambda$7 = OfferItemContentImpl.init$lambda$15$lambda$14$lambda$7(ConstraintLayout.LayoutParams.this, ((Integer) obj2).intValue());
                return init$lambda$15$lambda$14$lambda$7;
            }
        }), TuplesKt.to(new PropertyReference0Impl(constraints) { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$init$2$2$13
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((OfferItemContent.LayoutParams.Constraints) this.receiver).getTopToBottomId();
            }
        }, new Function1() { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit init$lambda$15$lambda$14$lambda$8;
                init$lambda$15$lambda$14$lambda$8 = OfferItemContentImpl.init$lambda$15$lambda$14$lambda$8(ConstraintLayout.LayoutParams.this, ((Integer) obj2).intValue());
                return init$lambda$15$lambda$14$lambda$8;
            }
        }), TuplesKt.to(new PropertyReference0Impl(constraints) { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$init$2$2$15
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((OfferItemContent.LayoutParams.Constraints) this.receiver).getBottomToTopId();
            }
        }, new Function1() { // from class: org.betup.ui.dialogs.offer.OfferItemContentImpl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit init$lambda$15$lambda$14$lambda$9;
                init$lambda$15$lambda$14$lambda$9 = OfferItemContentImpl.init$lambda$15$lambda$14$lambda$9(ConstraintLayout.LayoutParams.this, ((Integer) obj2).intValue());
                return init$lambda$15$lambda$14$lambda$9;
            }
        })).entrySet()) {
            KProperty0 kProperty0 = (KProperty0) entry.getKey();
            Function1 function1 = (Function1) entry.getValue();
            String str = (String) kProperty0.get();
            if (str != null) {
                if (Intrinsics.areEqual(str, VKApiUserFull.RelativeType.PARENT)) {
                    valueOf = Integer.valueOf(parentLayoutId);
                } else {
                    Iterator<T> it = builder.getElements().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(str, ((OfferItemContent) obj).getId())) {
                            break;
                        }
                    }
                    OfferItemContent offerItemContent = (OfferItemContent) obj;
                    valueOf = offerItemContent != null ? Integer.valueOf(offerItemContent.getViewId()) : null;
                }
                if (valueOf != null) {
                    function1.invoke(Integer.valueOf(valueOf.intValue()));
                }
            }
        }
        root2.setLayoutParams(layoutParams);
        bind(builder);
        return viewBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$15$lambda$14$lambda$2(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.startToStart = i;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$15$lambda$14$lambda$3(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.endToEnd = i;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$15$lambda$14$lambda$4(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.topToTop = i;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$15$lambda$14$lambda$5(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.bottomToBottom = i;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$15$lambda$14$lambda$6(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.startToEnd = i;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$15$lambda$14$lambda$7(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.endToStart = i;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$15$lambda$14$lambda$8(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.topToBottom = i;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$15$lambda$14$lambda$9(ConstraintLayout.LayoutParams layoutParams, int i) {
        layoutParams.bottomToTop = i;
        return Unit.INSTANCE;
    }
}
