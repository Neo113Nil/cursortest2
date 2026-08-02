package androidx.glance.appwidget;

import androidx.glance.appwidget.proto.LayoutProto;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutConfig;", "config"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.LayoutConfiguration$save$2", f = "WidgetLayout.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nWidgetLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetLayout.kt\nandroidx/glance/appwidget/LayoutConfiguration$save$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,369:1\n1855#2,2:370\n*S KotlinDebug\n*F\n+ 1 WidgetLayout.kt\nandroidx/glance/appwidget/LayoutConfiguration$save$2\n*L\n202#1:370,2\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutConfiguration$save$2 extends SuspendLambda implements Function2<LayoutProto.LayoutConfig, Continuation<? super LayoutProto.LayoutConfig>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LayoutConfiguration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutConfiguration$save$2(LayoutConfiguration layoutConfiguration, Continuation<? super LayoutConfiguration$save$2> continuation) {
        super(2, continuation);
        this.this$0 = layoutConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LayoutConfiguration$save$2 layoutConfiguration$save$2 = new LayoutConfiguration$save$2(this.this$0, continuation);
        layoutConfiguration$save$2.L$0 = obj;
        return layoutConfiguration$save$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LayoutProto.LayoutConfig layoutConfig, Continuation<? super LayoutProto.LayoutConfig> continuation) {
        return ((LayoutConfiguration$save$2) create(layoutConfig, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        Set set;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LayoutProto.LayoutConfig.Builder builder = ((LayoutProto.LayoutConfig) this.L$0).toBuilder();
        LayoutConfiguration layoutConfiguration = this.this$0;
        LayoutProto.LayoutConfig.Builder builder2 = builder;
        builder2.setNextIndex(builder2.getNextIndex());
        builder2.clearLayout();
        map = layoutConfiguration.layoutConfig;
        for (Map.Entry entry : map.entrySet()) {
            LayoutProto.LayoutNode layoutNode = (LayoutProto.LayoutNode) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            set = layoutConfiguration.usedLayoutIds;
            if (set.contains(Boxing.boxInt(intValue))) {
                LayoutProto.LayoutDefinition.Builder newBuilder = LayoutProto.LayoutDefinition.newBuilder();
                newBuilder.setLayout(layoutNode);
                newBuilder.setLayoutIndex(intValue);
                builder2.addLayout(newBuilder);
            }
        }
        return builder2.build();
    }
}
