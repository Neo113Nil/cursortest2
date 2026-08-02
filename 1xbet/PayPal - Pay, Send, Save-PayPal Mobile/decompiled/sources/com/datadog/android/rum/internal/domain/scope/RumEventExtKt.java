package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000 \u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\rH\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010#\u001a\u00020\"*\u00020\rH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010'\u001a\u00020&*\u00020%H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010*\u001a\u00020)*\u00020\u0017H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u00020,*\u00020\u001bH\u0000¢\u0006\u0004\b-\u0010.\u001a\u0013\u00100\u001a\u00020/*\u00020\rH\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u000202*\u00020\u0017H\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00106\u001a\u000205*\u00020\u001bH\u0000¢\u0006\u0004\b6\u00107\u001a\u001d\u0010<\u001a\u0004\u0018\u00010;*\u0002082\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010?\u001a\u00020>*\u00020\rH\u0000¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010B\u001a\u00020A*\u00020%H\u0000¢\u0006\u0004\bB\u0010C\u001a\u0013\u0010E\u001a\u00020D*\u00020\u0017H\u0000¢\u0006\u0004\bE\u0010F\u001a\u0013\u0010H\u001a\u00020G*\u00020\u001bH\u0000¢\u0006\u0004\bH\u0010I\u001a\u0013\u0010L\u001a\u00020K*\u00020JH\u0000¢\u0006\u0004\bL\u0010M\u001a\u0013\u0010P\u001a\u00020O*\u00020NH\u0000¢\u0006\u0004\bP\u0010Q\u001a\u0013\u0010T\u001a\u00020S*\u00020RH\u0000¢\u0006\u0004\bT\u0010U\u001a\u0013\u0010X\u001a\u00020W*\u00020VH\u0000¢\u0006\u0004\bX\u0010Y\u001a\u0013\u0010X\u001a\u00020[*\u00020ZH\u0000¢\u0006\u0004\bX\u0010\\\u001a\u0013\u0010^\u001a\u00020]*\u00020\rH\u0000¢\u0006\u0004\b^\u0010_\u001a\u0013\u0010a\u001a\u00020`*\u00020\u0017H\u0000¢\u0006\u0004\ba\u0010b\u001a\u0013\u0010d\u001a\u00020c*\u00020\u001bH\u0000¢\u0006\u0004\bd\u0010e\u001a\u0013\u0010g\u001a\u00020f*\u00020\u0017H\u0000¢\u0006\u0004\bg\u0010h\u001a\u0013\u0010j\u001a\u00020i*\u00020\u001bH\u0000¢\u0006\u0004\bj\u0010k\u001a\u0013\u0010n\u001a\u00020m*\u00020lH\u0000¢\u0006\u0004\bn\u0010o\u001a\u0013\u0010q\u001a\u00020p*\u00020\rH\u0000¢\u0006\u0004\bq\u0010r\u001a\u0013\u0010t\u001a\u00020s*\u00020\u0017H\u0000¢\u0006\u0004\bt\u0010u\u001a\u0013\u0010w\u001a\u00020v*\u00020\u001bH\u0000¢\u0006\u0004\bw\u0010x\u001a%\u0010|\u001a\u0004\u0018\u00010{*\u00020y2\u0006\u0010z\u001a\u0002082\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b|\u0010}\u001a&\u0010|\u001a\u0004\u0018\u00010\u007f*\u00020~2\u0006\u0010z\u001a\u0002082\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0005\b|\u0010\u0080\u0001\u001a(\u0010|\u001a\u0005\u0018\u00010\u0082\u0001*\u00030\u0081\u00012\u0006\u0010z\u001a\u0002082\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0005\b|\u0010\u0083\u0001\u001a(\u0010|\u001a\u0005\u0018\u00010\u0085\u0001*\u00030\u0084\u00012\u0006\u0010z\u001a\u0002082\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0005\b|\u0010\u0086\u0001\u001a(\u0010|\u001a\u0005\u0018\u00010\u0088\u0001*\u00030\u0087\u00012\u0006\u0010z\u001a\u0002082\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0005\b|\u0010\u0089\u0001\u001a(\u0010|\u001a\u0005\u0018\u00010\u008b\u0001*\u00030\u008a\u00012\u0006\u0010z\u001a\u0002082\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0005\b|\u0010\u008c\u0001\u001a(\u0010|\u001a\u0005\u0018\u00010\u008e\u0001*\u00030\u008d\u00012\u0006\u0010z\u001a\u0002082\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0005\b|\u0010\u008f\u0001\"\u0017\u0010\u0090\u0001\u001a\u0002088\u0000X\u0080T¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "connect", "(Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "dns", "(Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "Lcom/datadog/android/rum/model/ResourceEvent$Download;", "download", "(Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)Lcom/datadog/android/rum/model/ResourceEvent$Download;", "Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "firstByte", "(Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "Lcom/datadog/android/api/context/NetworkInfo;", "", "isConnected", "(Lcom/datadog/android/api/context/NetworkInfo;)Z", "Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "ssl", "(Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "toActionConnectivity", "(Lcom/datadog/android/api/context/NetworkInfo;)Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "Lcom/datadog/android/api/context/DeviceType;", "Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "toActionSchemaType", "(Lcom/datadog/android/api/context/DeviceType;)Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "toActionSessionPrecondition", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "toAppLaunchVitalConnectivity", "(Lcom/datadog/android/api/context/NetworkInfo;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "toErrorConnectivity", "(Lcom/datadog/android/api/context/NetworkInfo;)Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "Lcom/datadog/android/rum/RumResourceMethod;", "Lcom/datadog/android/rum/model/ErrorEvent$Method;", "toErrorMethod", "(Lcom/datadog/android/rum/RumResourceMethod;)Lcom/datadog/android/rum/model/ErrorEvent$Method;", "Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "toErrorSchemaType", "(Lcom/datadog/android/api/context/DeviceType;)Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "toErrorSessionPrecondition", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "Lcom/datadog/android/rum/model/LongTaskEvent$Connectivity;", "toLongTaskConnectivity", "(Lcom/datadog/android/api/context/NetworkInfo;)Lcom/datadog/android/rum/model/LongTaskEvent$Connectivity;", "Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;", "toLongTaskSchemaType", "(Lcom/datadog/android/api/context/DeviceType;)Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;", "Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;", "toLongTaskSessionPrecondition", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "toOperationType", "(Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "toResourceConnectivity", "(Lcom/datadog/android/api/context/NetworkInfo;)Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "toResourceMethod", "(Lcom/datadog/android/rum/RumResourceMethod;)Lcom/datadog/android/rum/model/ResourceEvent$Method;", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "toResourceSchemaType", "(Lcom/datadog/android/api/context/DeviceType;)Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "toResourceSessionPrecondition", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "Lcom/datadog/android/rum/featureoperations/FailureReason;", "Lcom/datadog/android/rum/model/VitalOperationStepEvent$FailureReason;", "toSchemaFailureReason", "(Lcom/datadog/android/rum/featureoperations/FailureReason;)Lcom/datadog/android/rum/model/VitalOperationStepEvent$FailureReason;", "Lcom/datadog/android/rum/RumErrorSource;", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "toSchemaSource", "(Lcom/datadog/android/rum/RumErrorSource;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "Lcom/datadog/android/rum/internal/RumErrorSourceType;", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "toSchemaSourceType", "(Lcom/datadog/android/rum/internal/RumErrorSourceType;)Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "Lcom/datadog/android/rum/RumActionType;", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "toSchemaType", "(Lcom/datadog/android/rum/RumActionType;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "Lcom/datadog/android/rum/RumResourceKind;", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "(Lcom/datadog/android/rum/RumResourceKind;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "toViewConnectivity", "(Lcom/datadog/android/api/context/NetworkInfo;)Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "toViewSchemaType", "(Lcom/datadog/android/api/context/DeviceType;)Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "toViewSessionPrecondition", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;", "toVitalAppLaunchSchemaType", "(Lcom/datadog/android/api/context/DeviceType;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;", "toVitalAppLaunchSessionPrecondition", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;", "toVitalAppLaunchStartupType", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;", "Lcom/datadog/android/rum/model/VitalOperationStepEvent$Connectivity;", "toVitalOperationStepConnectivity", "(Lcom/datadog/android/api/context/NetworkInfo;)Lcom/datadog/android/rum/model/VitalOperationStepEvent$Connectivity;", "Lcom/datadog/android/rum/model/VitalOperationStepEvent$DeviceType;", "toVitalOperationStepSchemaType", "(Lcom/datadog/android/api/context/DeviceType;)Lcom/datadog/android/rum/model/VitalOperationStepEvent$DeviceType;", "Lcom/datadog/android/rum/model/VitalOperationStepEvent$SessionPrecondition;", "toVitalOperationStepSessionPrecondition", "(Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;)Lcom/datadog/android/rum/model/VitalOperationStepEvent$SessionPrecondition;", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource$Companion;", "source", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "tryFromSource", "(Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource$Companion;", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "(Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource$Companion;", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "(Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource$Companion;", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "(Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource$Companion;", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "(Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource$Companion;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "Lcom/datadog/android/rum/model/VitalOperationStepEvent$VitalOperationStepEventSource$Companion;", "Lcom/datadog/android/rum/model/VitalOperationStepEvent$VitalOperationStepEventSource;", "(Lcom/datadog/android/rum/model/VitalOperationStepEvent$VitalOperationStepEventSource$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/rum/model/VitalOperationStepEvent$VitalOperationStepEventSource;", "UNKNOWN_SOURCE_WARNING_MESSAGE_FORMAT", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumEventExtKt {
    public static final java.lang.String UNKNOWN_SOURCE_WARNING_MESSAGE_FORMAT = "You are using an unknown source %s for your events";

    public static final com.datadog.android.rum.model.ResourceEvent.Method toResourceMethod(com.datadog.android.rum.RumResourceMethod rumResourceMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceMethod, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$0[rumResourceMethod.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ResourceEvent.Method.GET;
            case 2:
                return com.datadog.android.rum.model.ResourceEvent.Method.POST;
            case 3:
                return com.datadog.android.rum.model.ResourceEvent.Method.HEAD;
            case 4:
                return com.datadog.android.rum.model.ResourceEvent.Method.PUT;
            case 5:
                return com.datadog.android.rum.model.ResourceEvent.Method.DELETE;
            case 6:
                return com.datadog.android.rum.model.ResourceEvent.Method.PATCH;
            case 7:
                return com.datadog.android.rum.model.ResourceEvent.Method.TRACE;
            case 8:
                return com.datadog.android.rum.model.ResourceEvent.Method.OPTIONS;
            case 9:
                return com.datadog.android.rum.model.ResourceEvent.Method.CONNECT;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ErrorEvent.Method toErrorMethod(com.datadog.android.rum.RumResourceMethod rumResourceMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceMethod, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$0[rumResourceMethod.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ErrorEvent.Method.GET;
            case 2:
                return com.datadog.android.rum.model.ErrorEvent.Method.POST;
            case 3:
                return com.datadog.android.rum.model.ErrorEvent.Method.HEAD;
            case 4:
                return com.datadog.android.rum.model.ErrorEvent.Method.PUT;
            case 5:
                return com.datadog.android.rum.model.ErrorEvent.Method.DELETE;
            case 6:
                return com.datadog.android.rum.model.ErrorEvent.Method.PATCH;
            case 7:
                return com.datadog.android.rum.model.ErrorEvent.Method.TRACE;
            case 8:
                return com.datadog.android.rum.model.ErrorEvent.Method.OPTIONS;
            case 9:
                return com.datadog.android.rum.model.ErrorEvent.Method.CONNECT;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ResourceEvent.OperationType toOperationType(final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = str.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return com.datadog.android.rum.model.ResourceEvent.OperationType.valueOf(upperCase);
        } catch (java.lang.IllegalArgumentException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$toOperationType$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String str2 = str;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to convert [");
                    sb.append(str2);
                    sb.append("] to a valid graphql operation type");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.rum.model.ResourceEvent.ResourceType toSchemaType(com.datadog.android.rum.RumResourceKind rumResourceKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceKind, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$1[rumResourceKind.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.BEACON;
            case 2:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.FETCH;
            case 3:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.XHR;
            case 4:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.DOCUMENT;
            case 5:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.IMAGE;
            case 6:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.JS;
            case 7:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.FONT;
            case 8:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.CSS;
            case 9:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.MEDIA;
            case 10:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.NATIVE;
            case 11:
            case 12:
                return com.datadog.android.rum.model.ResourceEvent.ResourceType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ErrorEvent.ErrorSource toSchemaSource(com.datadog.android.rum.RumErrorSource rumErrorSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumErrorSource, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$2[rumErrorSource.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ErrorEvent.ErrorSource.NETWORK;
            case 2:
                return com.datadog.android.rum.model.ErrorEvent.ErrorSource.SOURCE;
            case 3:
                return com.datadog.android.rum.model.ErrorEvent.ErrorSource.CONSOLE;
            case 4:
                return com.datadog.android.rum.model.ErrorEvent.ErrorSource.LOGGER;
            case 5:
                return com.datadog.android.rum.model.ErrorEvent.ErrorSource.AGENT;
            case 6:
                return com.datadog.android.rum.model.ErrorEvent.ErrorSource.WEBVIEW;
            case 7:
                return com.datadog.android.rum.model.ErrorEvent.ErrorSource.CUSTOM;
            case 8:
                return com.datadog.android.rum.model.ErrorEvent.ErrorSource.REPORT;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ErrorEvent.SourceType toSchemaSourceType(com.datadog.android.rum.internal.RumErrorSourceType rumErrorSourceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumErrorSourceType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$3[rumErrorSourceType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ErrorEvent.SourceType.ANDROID;
            case 2:
                return com.datadog.android.rum.model.ErrorEvent.SourceType.BROWSER;
            case 3:
                return com.datadog.android.rum.model.ErrorEvent.SourceType.REACT_NATIVE;
            case 4:
                return com.datadog.android.rum.model.ErrorEvent.SourceType.FLUTTER;
            case 5:
                return com.datadog.android.rum.model.ErrorEvent.SourceType.NDK;
            case 6:
                return com.datadog.android.rum.model.ErrorEvent.SourceType.NDK_IL2CPP;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ResourceEvent.Dns dns(com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceTiming, "");
        if (resourceTiming.getDnsStart() > 0) {
            return new com.datadog.android.rum.model.ResourceEvent.Dns(resourceTiming.getDnsDuration(), resourceTiming.getDnsStart());
        }
        return null;
    }

    public static final com.datadog.android.rum.model.ResourceEvent.Connect connect(com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceTiming, "");
        if (resourceTiming.getConnectStart() > 0) {
            return new com.datadog.android.rum.model.ResourceEvent.Connect(resourceTiming.getConnectDuration(), resourceTiming.getConnectStart());
        }
        return null;
    }

    public static final com.datadog.android.rum.model.ResourceEvent.Ssl ssl(com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceTiming, "");
        if (resourceTiming.getSslStart() > 0) {
            return new com.datadog.android.rum.model.ResourceEvent.Ssl(resourceTiming.getSslDuration(), resourceTiming.getSslStart());
        }
        return null;
    }

    public static final com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte(com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceTiming, "");
        if (resourceTiming.getFirstByteStart() < 0 || resourceTiming.getFirstByteDuration() <= 0) {
            return null;
        }
        return new com.datadog.android.rum.model.ResourceEvent.FirstByte(resourceTiming.getFirstByteDuration(), resourceTiming.getFirstByteStart());
    }

    public static final com.datadog.android.rum.model.ResourceEvent.Download download(com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceTiming, "");
        if (resourceTiming.getDownloadStart() > 0) {
            return new com.datadog.android.rum.model.ResourceEvent.Download(resourceTiming.getDownloadDuration(), resourceTiming.getDownloadStart());
        }
        return null;
    }

    public static final com.datadog.android.rum.model.ActionEvent.ActionEventActionType toSchemaType(com.datadog.android.rum.RumActionType rumActionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumActionType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$4[rumActionType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ActionEvent.ActionEventActionType.TAP;
            case 2:
                return com.datadog.android.rum.model.ActionEvent.ActionEventActionType.SCROLL;
            case 3:
                return com.datadog.android.rum.model.ActionEvent.ActionEventActionType.SWIPE;
            case 4:
                return com.datadog.android.rum.model.ActionEvent.ActionEventActionType.CLICK;
            case 5:
                return com.datadog.android.rum.model.ActionEvent.ActionEventActionType.BACK;
            case 6:
                return com.datadog.android.rum.model.ActionEvent.ActionEventActionType.CUSTOM;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ResourceEvent.Connectivity toResourceConnectivity(com.datadog.android.api.context.NetworkInfo networkInfo) {
        com.datadog.android.rum.model.ResourceEvent.Status status;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        if (isConnected(networkInfo)) {
            status = com.datadog.android.rum.model.ResourceEvent.Status.CONNECTED;
        } else {
            status = com.datadog.android.rum.model.ResourceEvent.Status.NOT_CONNECTED;
        }
        com.datadog.android.rum.model.ResourceEvent.Status status2 = status;
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ResourceEvent.Interface.ETHERNET);
                break;
            case 2:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ResourceEvent.Interface.WIFI);
                break;
            case 3:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ResourceEvent.Interface.WIMAX);
                break;
            case 4:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ResourceEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ResourceEvent.Interface.CELLULAR);
                break;
            case 11:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ResourceEvent.Interface.OTHER);
                break;
            case 12:
                listOf = kotlin.collections.CollectionsKt.emptyList();
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.datadog.android.rum.model.ResourceEvent.Connectivity(status2, listOf, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new com.datadog.android.rum.model.ResourceEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final com.datadog.android.rum.model.ErrorEvent.Connectivity toErrorConnectivity(com.datadog.android.api.context.NetworkInfo networkInfo) {
        com.datadog.android.rum.model.ErrorEvent.Status status;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        if (isConnected(networkInfo)) {
            status = com.datadog.android.rum.model.ErrorEvent.Status.CONNECTED;
        } else {
            status = com.datadog.android.rum.model.ErrorEvent.Status.NOT_CONNECTED;
        }
        com.datadog.android.rum.model.ErrorEvent.Status status2 = status;
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ErrorEvent.Interface.ETHERNET);
                break;
            case 2:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ErrorEvent.Interface.WIFI);
                break;
            case 3:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ErrorEvent.Interface.WIMAX);
                break;
            case 4:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ErrorEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ErrorEvent.Interface.CELLULAR);
                break;
            case 11:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ErrorEvent.Interface.OTHER);
                break;
            case 12:
                listOf = kotlin.collections.CollectionsKt.emptyList();
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.datadog.android.rum.model.ErrorEvent.Connectivity(status2, listOf, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new com.datadog.android.rum.model.ErrorEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final com.datadog.android.rum.model.LongTaskEvent.Connectivity toLongTaskConnectivity(com.datadog.android.api.context.NetworkInfo networkInfo) {
        com.datadog.android.rum.model.LongTaskEvent.ConnectivityStatus connectivityStatus;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        if (isConnected(networkInfo)) {
            connectivityStatus = com.datadog.android.rum.model.LongTaskEvent.ConnectivityStatus.CONNECTED;
        } else {
            connectivityStatus = com.datadog.android.rum.model.LongTaskEvent.ConnectivityStatus.NOT_CONNECTED;
        }
        com.datadog.android.rum.model.LongTaskEvent.ConnectivityStatus connectivityStatus2 = connectivityStatus;
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.LongTaskEvent.Interface.ETHERNET);
                break;
            case 2:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.LongTaskEvent.Interface.WIFI);
                break;
            case 3:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.LongTaskEvent.Interface.WIMAX);
                break;
            case 4:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.LongTaskEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.LongTaskEvent.Interface.CELLULAR);
                break;
            case 11:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.LongTaskEvent.Interface.OTHER);
                break;
            case 12:
                listOf = kotlin.collections.CollectionsKt.emptyList();
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.datadog.android.rum.model.LongTaskEvent.Connectivity(connectivityStatus2, listOf, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new com.datadog.android.rum.model.LongTaskEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final com.datadog.android.rum.model.ViewEvent.Connectivity toViewConnectivity(com.datadog.android.api.context.NetworkInfo networkInfo) {
        com.datadog.android.rum.model.ViewEvent.ConnectivityStatus connectivityStatus;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        if (isConnected(networkInfo)) {
            connectivityStatus = com.datadog.android.rum.model.ViewEvent.ConnectivityStatus.CONNECTED;
        } else {
            connectivityStatus = com.datadog.android.rum.model.ViewEvent.ConnectivityStatus.NOT_CONNECTED;
        }
        com.datadog.android.rum.model.ViewEvent.ConnectivityStatus connectivityStatus2 = connectivityStatus;
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ViewEvent.Interface.ETHERNET);
                break;
            case 2:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ViewEvent.Interface.WIFI);
                break;
            case 3:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ViewEvent.Interface.WIMAX);
                break;
            case 4:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ViewEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ViewEvent.Interface.CELLULAR);
                break;
            case 11:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ViewEvent.Interface.OTHER);
                break;
            case 12:
                listOf = kotlin.collections.CollectionsKt.emptyList();
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.datadog.android.rum.model.ViewEvent.Connectivity(connectivityStatus2, listOf, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new com.datadog.android.rum.model.ViewEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final com.datadog.android.rum.model.ActionEvent.Connectivity toActionConnectivity(com.datadog.android.api.context.NetworkInfo networkInfo) {
        com.datadog.android.rum.model.ActionEvent.Status status;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        if (isConnected(networkInfo)) {
            status = com.datadog.android.rum.model.ActionEvent.Status.CONNECTED;
        } else {
            status = com.datadog.android.rum.model.ActionEvent.Status.NOT_CONNECTED;
        }
        com.datadog.android.rum.model.ActionEvent.Status status2 = status;
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ActionEvent.Interface.ETHERNET);
                break;
            case 2:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ActionEvent.Interface.WIFI);
                break;
            case 3:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ActionEvent.Interface.WIMAX);
                break;
            case 4:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ActionEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ActionEvent.Interface.CELLULAR);
                break;
            case 11:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.ActionEvent.Interface.OTHER);
                break;
            case 12:
                listOf = kotlin.collections.CollectionsKt.emptyList();
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.datadog.android.rum.model.ActionEvent.Connectivity(status2, listOf, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new com.datadog.android.rum.model.ActionEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final com.datadog.android.rum.model.VitalOperationStepEvent.Connectivity toVitalOperationStepConnectivity(com.datadog.android.api.context.NetworkInfo networkInfo) {
        com.datadog.android.rum.model.VitalOperationStepEvent.Status status;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        if (isConnected(networkInfo)) {
            status = com.datadog.android.rum.model.VitalOperationStepEvent.Status.CONNECTED;
        } else {
            status = com.datadog.android.rum.model.VitalOperationStepEvent.Status.NOT_CONNECTED;
        }
        com.datadog.android.rum.model.VitalOperationStepEvent.Status status2 = status;
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalOperationStepEvent.Interface.ETHERNET);
                break;
            case 2:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalOperationStepEvent.Interface.WIFI);
                break;
            case 3:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalOperationStepEvent.Interface.WIMAX);
                break;
            case 4:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalOperationStepEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalOperationStepEvent.Interface.CELLULAR);
                break;
            case 11:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalOperationStepEvent.Interface.OTHER);
                break;
            case 12:
                listOf = kotlin.collections.CollectionsKt.emptyList();
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.datadog.android.rum.model.VitalOperationStepEvent.Connectivity(status2, listOf, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new com.datadog.android.rum.model.VitalOperationStepEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity toAppLaunchVitalConnectivity(com.datadog.android.api.context.NetworkInfo networkInfo) {
        com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus connectivityStatus;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        if (isConnected(networkInfo)) {
            connectivityStatus = com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus.CONNECTED;
        } else {
            connectivityStatus = com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus.NOT_CONNECTED;
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus connectivityStatus2 = connectivityStatus;
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.ETHERNET);
                break;
            case 2:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.WIFI);
                break;
            case 3:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.WIMAX);
                break;
            case 4:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.CELLULAR);
                break;
            case 11:
                listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.OTHER);
                break;
            case 12:
                listOf = kotlin.collections.CollectionsKt.emptyList();
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity(connectivityStatus2, listOf, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final boolean isConnected(com.datadog.android.api.context.NetworkInfo networkInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        return networkInfo.getConnectivity() != com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED;
    }

    public static final com.datadog.android.rum.model.ViewEvent.DeviceType toViewSchemaType(com.datadog.android.api.context.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ViewEvent.DeviceType.MOBILE;
            case 2:
                return com.datadog.android.rum.model.ViewEvent.DeviceType.TABLET;
            case 3:
                return com.datadog.android.rum.model.ViewEvent.DeviceType.TV;
            case 4:
                return com.datadog.android.rum.model.ViewEvent.DeviceType.DESKTOP;
            case 5:
                return com.datadog.android.rum.model.ViewEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return com.datadog.android.rum.model.ViewEvent.DeviceType.BOT;
            case 7:
                return com.datadog.android.rum.model.ViewEvent.DeviceType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ActionEvent.DeviceType toActionSchemaType(com.datadog.android.api.context.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ActionEvent.DeviceType.MOBILE;
            case 2:
                return com.datadog.android.rum.model.ActionEvent.DeviceType.TABLET;
            case 3:
                return com.datadog.android.rum.model.ActionEvent.DeviceType.TV;
            case 4:
                return com.datadog.android.rum.model.ActionEvent.DeviceType.DESKTOP;
            case 5:
                return com.datadog.android.rum.model.ActionEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return com.datadog.android.rum.model.ActionEvent.DeviceType.BOT;
            case 7:
                return com.datadog.android.rum.model.ActionEvent.DeviceType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.LongTaskEvent.DeviceType toLongTaskSchemaType(com.datadog.android.api.context.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.LongTaskEvent.DeviceType.MOBILE;
            case 2:
                return com.datadog.android.rum.model.LongTaskEvent.DeviceType.TABLET;
            case 3:
                return com.datadog.android.rum.model.LongTaskEvent.DeviceType.TV;
            case 4:
                return com.datadog.android.rum.model.LongTaskEvent.DeviceType.DESKTOP;
            case 5:
                return com.datadog.android.rum.model.LongTaskEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return com.datadog.android.rum.model.LongTaskEvent.DeviceType.BOT;
            case 7:
                return com.datadog.android.rum.model.LongTaskEvent.DeviceType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ResourceEvent.DeviceType toResourceSchemaType(com.datadog.android.api.context.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ResourceEvent.DeviceType.MOBILE;
            case 2:
                return com.datadog.android.rum.model.ResourceEvent.DeviceType.TABLET;
            case 3:
                return com.datadog.android.rum.model.ResourceEvent.DeviceType.TV;
            case 4:
                return com.datadog.android.rum.model.ResourceEvent.DeviceType.DESKTOP;
            case 5:
                return com.datadog.android.rum.model.ResourceEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return com.datadog.android.rum.model.ResourceEvent.DeviceType.BOT;
            case 7:
                return com.datadog.android.rum.model.ResourceEvent.DeviceType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ErrorEvent.DeviceType toErrorSchemaType(com.datadog.android.api.context.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ErrorEvent.DeviceType.MOBILE;
            case 2:
                return com.datadog.android.rum.model.ErrorEvent.DeviceType.TABLET;
            case 3:
                return com.datadog.android.rum.model.ErrorEvent.DeviceType.TV;
            case 4:
                return com.datadog.android.rum.model.ErrorEvent.DeviceType.DESKTOP;
            case 5:
                return com.datadog.android.rum.model.ErrorEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return com.datadog.android.rum.model.ErrorEvent.DeviceType.BOT;
            case 7:
                return com.datadog.android.rum.model.ErrorEvent.DeviceType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.VitalOperationStepEvent.DeviceType toVitalOperationStepSchemaType(com.datadog.android.api.context.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.VitalOperationStepEvent.DeviceType.MOBILE;
            case 2:
                return com.datadog.android.rum.model.VitalOperationStepEvent.DeviceType.TABLET;
            case 3:
                return com.datadog.android.rum.model.VitalOperationStepEvent.DeviceType.TV;
            case 4:
                return com.datadog.android.rum.model.VitalOperationStepEvent.DeviceType.DESKTOP;
            case 5:
                return com.datadog.android.rum.model.VitalOperationStepEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return com.datadog.android.rum.model.VitalOperationStepEvent.DeviceType.BOT;
            case 7:
                return com.datadog.android.rum.model.VitalOperationStepEvent.DeviceType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType toVitalAppLaunchSchemaType(com.datadog.android.api.context.DeviceType deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.MOBILE;
            case 2:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.TABLET;
            case 3:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.TV;
            case 4:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.DESKTOP;
            case 5:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.BOT;
            case 7:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ViewEvent.ViewEventSource tryFromSource(com.datadog.android.rum.model.ViewEvent.ViewEventSource.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSource tryFromSource(com.datadog.android.rum.model.LongTaskEvent.LongTaskEventSource.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.rum.model.ErrorEvent.ErrorEventSource tryFromSource(com.datadog.android.rum.model.ErrorEvent.ErrorEventSource.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.rum.model.ActionEvent.ActionEventSource tryFromSource(com.datadog.android.rum.model.ActionEvent.ActionEventSource.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$4
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource tryFromSource(com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$5
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSource tryFromSource(com.datadog.android.rum.model.VitalOperationStepEvent.VitalOperationStepEventSource.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$6
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource tryFromSource(com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$7
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.rum.model.ViewEvent.SessionPrecondition toViewSessionPrecondition(com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ViewEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return com.datadog.android.rum.model.ViewEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return com.datadog.android.rum.model.ViewEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return com.datadog.android.rum.model.ViewEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return com.datadog.android.rum.model.ViewEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return com.datadog.android.rum.model.ViewEvent.SessionPrecondition.PREWARM;
            case 7:
                return com.datadog.android.rum.model.ViewEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ActionEvent.SessionPrecondition toActionSessionPrecondition(com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ActionEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return com.datadog.android.rum.model.ActionEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return com.datadog.android.rum.model.ActionEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return com.datadog.android.rum.model.ActionEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return com.datadog.android.rum.model.ActionEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return com.datadog.android.rum.model.ActionEvent.SessionPrecondition.PREWARM;
            case 7:
                return com.datadog.android.rum.model.ActionEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ErrorEvent.SessionPrecondition toErrorSessionPrecondition(com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.PREWARM;
            case 7:
                return com.datadog.android.rum.model.ErrorEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.ResourceEvent.SessionPrecondition toResourceSessionPrecondition(com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.PREWARM;
            case 7:
                return com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.LongTaskEvent.SessionPrecondition toLongTaskSessionPrecondition(com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.LongTaskEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return com.datadog.android.rum.model.LongTaskEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return com.datadog.android.rum.model.LongTaskEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return com.datadog.android.rum.model.LongTaskEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return com.datadog.android.rum.model.LongTaskEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return com.datadog.android.rum.model.LongTaskEvent.SessionPrecondition.PREWARM;
            case 7:
                return com.datadog.android.rum.model.LongTaskEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.VitalOperationStepEvent.SessionPrecondition toVitalOperationStepSessionPrecondition(com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.VitalOperationStepEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return com.datadog.android.rum.model.VitalOperationStepEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return com.datadog.android.rum.model.VitalOperationStepEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return com.datadog.android.rum.model.VitalOperationStepEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return com.datadog.android.rum.model.VitalOperationStepEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return com.datadog.android.rum.model.VitalOperationStepEvent.SessionPrecondition.PREWARM;
            case 7:
                return com.datadog.android.rum.model.VitalOperationStepEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition toVitalAppLaunchSessionPrecondition(com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        switch (com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.PREWARM;
            case 7:
                return com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.datadog.android.rum.model.VitalOperationStepEvent.FailureReason toSchemaFailureReason(com.datadog.android.rum.featureoperations.FailureReason failureReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
        int i = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.WhenMappings.$EnumSwitchMapping$8[failureReason.ordinal()];
        if (i == 1) {
            return com.datadog.android.rum.model.VitalOperationStepEvent.FailureReason.ERROR;
        }
        if (i == 2) {
            return com.datadog.android.rum.model.VitalOperationStepEvent.FailureReason.ABANDONED;
        }
        if (i == 3) {
            return com.datadog.android.rum.model.VitalOperationStepEvent.FailureReason.OTHER;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType toVitalAppLaunchStartupType(com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumStartupScenario, "");
        if (rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.Cold) {
            return com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType.COLD_START;
        }
        if ((rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.WarmAfterActivityDestroyed) || (rumStartupScenario instanceof com.datadog.android.rum.internal.startup.RumStartupScenario.WarmFirstActivity)) {
            return com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType.WARM_START;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;

        static {
            int[] iArr = new int[com.datadog.android.rum.RumResourceMethod.values().length];
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.HEAD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.PUT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.DELETE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.PATCH.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.TRACE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.OPTIONS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.datadog.android.rum.RumResourceMethod.CONNECT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.datadog.android.rum.RumResourceKind.values().length];
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.BEACON.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.FETCH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.XHR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.DOCUMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.IMAGE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.JS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.FONT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.CSS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.MEDIA.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.NATIVE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.UNKNOWN.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr2[com.datadog.android.rum.RumResourceKind.OTHER.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.datadog.android.rum.RumErrorSource.values().length];
            try {
                iArr3[com.datadog.android.rum.RumErrorSource.NETWORK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr3[com.datadog.android.rum.RumErrorSource.SOURCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr3[com.datadog.android.rum.RumErrorSource.CONSOLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr3[com.datadog.android.rum.RumErrorSource.LOGGER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr3[com.datadog.android.rum.RumErrorSource.AGENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr3[com.datadog.android.rum.RumErrorSource.WEBVIEW.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr3[com.datadog.android.rum.RumErrorSource.CUSTOM.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr3[com.datadog.android.rum.RumErrorSource.REPORT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.datadog.android.rum.internal.RumErrorSourceType.values().length];
            try {
                iArr4[com.datadog.android.rum.internal.RumErrorSourceType.ANDROID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr4[com.datadog.android.rum.internal.RumErrorSourceType.BROWSER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr4[com.datadog.android.rum.internal.RumErrorSourceType.REACT_NATIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr4[com.datadog.android.rum.internal.RumErrorSourceType.FLUTTER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr4[com.datadog.android.rum.internal.RumErrorSourceType.NDK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr4[com.datadog.android.rum.internal.RumErrorSourceType.NDK_IL2CPP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.datadog.android.rum.RumActionType.values().length];
            try {
                iArr5[com.datadog.android.rum.RumActionType.TAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr5[com.datadog.android.rum.RumActionType.SCROLL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr5[com.datadog.android.rum.RumActionType.SWIPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr5[com.datadog.android.rum.RumActionType.CLICK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr5[com.datadog.android.rum.RumActionType.BACK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr5[com.datadog.android.rum.RumActionType.CUSTOM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[com.datadog.android.api.context.NetworkInfo.Connectivity.values().length];
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_ETHERNET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_WIFI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_WIMAX.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_BLUETOOTH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_2G.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_3G.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_4G.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_5G.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_MOBILE_OTHER.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_CELLULAR.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_OTHER.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                iArr6[com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[com.datadog.android.api.context.DeviceType.values().length];
            try {
                iArr7[com.datadog.android.api.context.DeviceType.MOBILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                iArr7[com.datadog.android.api.context.DeviceType.TABLET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                iArr7[com.datadog.android.api.context.DeviceType.TV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                iArr7[com.datadog.android.api.context.DeviceType.DESKTOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                iArr7[com.datadog.android.api.context.DeviceType.GAMING_CONSOLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                iArr7[com.datadog.android.api.context.DeviceType.BOT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                iArr7[com.datadog.android.api.context.DeviceType.OTHER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.values().length];
            try {
                iArr8[com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.USER_APP_LAUNCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                iArr8[com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.INACTIVITY_TIMEOUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            try {
                iArr8[com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.MAX_DURATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused63) {
            }
            try {
                iArr8[com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.EXPLICIT_STOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused64) {
            }
            try {
                iArr8[com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.BACKGROUND_LAUNCH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused65) {
            }
            try {
                iArr8[com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.PREWARM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused66) {
            }
            try {
                iArr8[com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.FROM_NON_INTERACTIVE_SESSION.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused67) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[com.datadog.android.rum.featureoperations.FailureReason.values().length];
            try {
                iArr9[com.datadog.android.rum.featureoperations.FailureReason.ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused68) {
            }
            try {
                iArr9[com.datadog.android.rum.featureoperations.FailureReason.ABANDONED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused69) {
            }
            try {
                iArr9[com.datadog.android.rum.featureoperations.FailureReason.OTHER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused70) {
            }
            $EnumSwitchMapping$8 = iArr9;
        }
    }
}
