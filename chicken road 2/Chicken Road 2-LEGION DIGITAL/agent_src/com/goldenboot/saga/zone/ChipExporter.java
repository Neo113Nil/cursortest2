package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ChipExporter {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends PrimaryArbitrator {
        public final /* synthetic */ Object connectPatch;
        public final /* synthetic */ IconExporter notifyMessage;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(ServiceRegulator serviceRegulator, IconExporter iconExporter, Object obj) {
            super(serviceRegulator);
            this.notifyMessage = iconExporter;
            this.connectPatch = obj;
            Intrinsics.checkNotNull(serviceRegulator, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public Object invokeSuspend(Object obj) {
            int i = this.reduceScope;
            if (i == 0) {
                this.reduceScope = 1;
                ColumnForger.growPayload(obj);
                Intrinsics.checkNotNull(this.notifyMessage, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((IconExporter) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.notifyMessage, 2)).invoke(this.connectPatch, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.reduceScope = 2;
            ColumnForger.growPayload(obj);
            return obj;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends AnimBroadcaster {
        public final /* synthetic */ Object connectPatch;
        public final /* synthetic */ IconExporter notifyMessage;
        public int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(ServiceRegulator serviceRegulator, LongPressGateway longPressGateway, IconExporter iconExporter, Object obj) {
            super(serviceRegulator, longPressGateway);
            this.notifyMessage = iconExporter;
            this.connectPatch = obj;
            Intrinsics.checkNotNull(serviceRegulator, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public Object invokeSuspend(Object obj) {
            int i = this.reduceScope;
            if (i == 0) {
                this.reduceScope = 1;
                ColumnForger.growPayload(obj);
                Intrinsics.checkNotNull(this.notifyMessage, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((IconExporter) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.notifyMessage, 2)).invoke(this.connectPatch, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.reduceScope = 2;
            ColumnForger.growPayload(obj);
            return obj;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends PrimaryArbitrator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(ServiceRegulator serviceRegulator) {
            super(serviceRegulator);
            Intrinsics.checkNotNull(serviceRegulator, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public Object invokeSuspend(Object obj) {
            ColumnForger.growPayload(obj);
            return obj;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends AnimBroadcaster {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayerUseCase(ServiceRegulator serviceRegulator, LongPressGateway longPressGateway) {
            super(serviceRegulator, longPressGateway);
            Intrinsics.checkNotNull(serviceRegulator, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public Object invokeSuspend(Object obj) {
            ColumnForger.growPayload(obj);
            return obj;
        }
    }

    public static Object detachStream(IconExporter iconExporter, Object obj, ServiceRegulator completion) {
        Intrinsics.checkNotNullParameter(iconExporter, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((IconExporter) TypeIntrinsics.beforeCheckcastToFunctionOfArity(iconExporter, 2)).invoke(obj, growPayload(FeatureMeter.evictLayout(completion)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ServiceRegulator evictLayout(IconExporter iconExporter, Object obj, ServiceRegulator completion) {
        Intrinsics.checkNotNullParameter(iconExporter, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        ServiceRegulator evictLayout = FeatureMeter.evictLayout(completion);
        if (iconExporter instanceof ConfigValidator) {
            return ((ConfigValidator) iconExporter).create(obj, evictLayout);
        }
        LongPressGateway context = evictLayout.getContext();
        return context == BackgroundIndex.reduceScope ? new ActivityMutator(evictLayout, iconExporter, obj) : new BounceHandler(evictLayout, context, iconExporter, obj);
    }

    public static final ServiceRegulator growPayload(ServiceRegulator serviceRegulator) {
        LongPressGateway context = serviceRegulator.getContext();
        return context == BackgroundIndex.reduceScope ? new FeedbackFlow(serviceRegulator) : new LayerUseCase(serviceRegulator, context);
    }

    public static ServiceRegulator injectMetric(ServiceRegulator serviceRegulator) {
        ServiceRegulator intercepted;
        Intrinsics.checkNotNullParameter(serviceRegulator, "<this>");
        AnimBroadcaster animBroadcaster = serviceRegulator instanceof AnimBroadcaster ? (AnimBroadcaster) serviceRegulator : null;
        return (animBroadcaster == null || (intercepted = animBroadcaster.intercepted()) == null) ? serviceRegulator : intercepted;
    }
}
