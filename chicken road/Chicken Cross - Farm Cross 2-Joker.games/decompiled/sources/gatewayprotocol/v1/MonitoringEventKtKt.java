package gatewayprotocol.v1;

import gatewayprotocol.v1.MonitoringEventKt;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MonitoringEventKt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"monitoringEvent", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/MonitoringEventKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializemonitoringEvent", "copy", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MonitoringEventKtKt {
    /* renamed from: -initializemonitoringEvent, reason: not valid java name */
    public static final MonitoringEventRequestOuterClass.MonitoringEvent m7832initializemonitoringEvent(Function1<? super MonitoringEventKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MonitoringEventKt.Dsl.Companion companion = MonitoringEventKt.Dsl.INSTANCE;
        MonitoringEventRequestOuterClass.MonitoringEvent.Builder newBuilder = MonitoringEventRequestOuterClass.MonitoringEvent.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        MonitoringEventKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final MonitoringEventRequestOuterClass.MonitoringEvent copy(MonitoringEventRequestOuterClass.MonitoringEvent monitoringEvent, Function1<? super MonitoringEventKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(monitoringEvent, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MonitoringEventKt.Dsl.Companion companion = MonitoringEventKt.Dsl.INSTANCE;
        MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder = monitoringEvent.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        MonitoringEventKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
