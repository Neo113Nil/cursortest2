package com.datadog.android.rum.internal.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a.\u0010\u0005\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001aM\u0010\f\u001a\u00020\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "T", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "", "resolveViewName", "(Lcom/datadog/android/rum/tracking/ComponentPredicate;Ljava/lang/Object;)Ljava/lang/String;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lkotlin/Function1;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "runIfValid", "(Lcom/datadog/android/rum/tracking/ComponentPredicate;Ljava/lang/Object;Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentPredicateExtKt {
    public static final /* synthetic */ <T> void runIfValid(com.datadog.android.rum.tracking.ComponentPredicate<T> componentPredicate, T t, com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (componentPredicate.accept(t)) {
            try {
                function1.invoke(t);
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1.INSTANCE, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    public static final /* synthetic */ <T> java.lang.String resolveViewName(com.datadog.android.rum.tracking.ComponentPredicate<T> componentPredicate, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        java.lang.String viewName = componentPredicate.getViewName(t);
        java.lang.String str = viewName;
        return (str == null || kotlin.text.StringsKt.isBlank(str)) ? com.datadog.android.rum.internal.utils.ViewUtilsKt.resolveViewUrl(t) : viewName;
    }
}
