package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\fJ6\u0010\u0015\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0019\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/core/companion/data/CompanionConfigurationManager;", "Lcom/paypal/oslo/core/companion/domain/CompanionConfigurationApi;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "defaultConfiguration", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;)V", "getDefaultConfiguration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedConfig", "syncConfiguration", "(Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "getHighSpeedVideoFpsRangesFor", "", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "p1", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "p2", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompanionConfigurationManager implements com.paypal.oslo.core.companion.domain.CompanionConfigurationApi {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.core.companion.domain.CompanionAppConfiguration getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.companion.domain.CompanionAppConfiguration getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    public CompanionConfigurationManager(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionAppConfiguration, "");
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        this.getHighSpeedVideoFpsRangesFor = companionAppConfiguration;
        this.getHighSpeedVideoFpsRanges = companionAppConfiguration;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.paypal.oslo.core.companion.domain.CompanionConfigurationApi
    public final java.lang.Object getDefaultConfiguration(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.core.companion.data.CompanionConfigurationManager$getDefaultConfiguration$2(this, null), continuation);
    }

    @Override // com.paypal.oslo.core.companion.domain.CompanionConfigurationApi
    public final java.lang.Object syncConfiguration(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.core.companion.data.CompanionConfigurationManager$syncConfiguration$2(companionAppConfiguration, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01be, code lost:
    
        if (getHighSpeedVideoFpsRanges(r6, r7, r8, r2) == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d4, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c4, code lost:
    
        r13 = r5;
        r0 = r7;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x008a, code lost:
    
        if (r4.lock(null, r2) != r3) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01be -> B:11:0x01c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedConfigs$1 companionConfigurationManager$overrideUpdatedConfigs$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration2;
        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration3;
        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration4;
        java.util.Iterator it;
        java.lang.Iterable iterable;
        int i2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.Iterator it2;
        try {
            if (continuation instanceof com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedConfigs$1) {
                companionConfigurationManager$overrideUpdatedConfigs$1 = (com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedConfigs$1) continuation;
                if ((companionConfigurationManager$overrideUpdatedConfigs$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    companionConfigurationManager$overrideUpdatedConfigs$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj3 = companionConfigurationManager$overrideUpdatedConfigs$1.getOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = companionConfigurationManager$overrideUpdatedConfigs$1.getOutputFormats;
                    char c = 2;
                    boolean z = false;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Applying resolver overrides for updated fields", null, null, 6, null);
                        mutex = this.getHighResolutionOutputSizeshNQ4ISI;
                        companionAppConfiguration2 = companionAppConfiguration;
                        companionConfigurationManager$overrideUpdatedConfigs$1.getHighResolutionOutputSizeshNQ4ISI = companionAppConfiguration2;
                        companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoFpsRanges = mutex;
                        companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoFpsRangesFor = 0;
                        companionConfigurationManager$overrideUpdatedConfigs$1.getOutputFormats = 1;
                    } else if (i == 1) {
                        int i3 = companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoFpsRangesFor;
                        mutex = (kotlinx.coroutines.sync.Mutex) companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration5 = (com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) companionConfigurationManager$overrideUpdatedConfigs$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        companionAppConfiguration2 = companionAppConfiguration5;
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoSizes;
                        i2 = companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object obj4 = companionConfigurationManager$overrideUpdatedConfigs$1.getInputSizeshNQ4ISI;
                        it = (java.util.Iterator) companionConfigurationManager$overrideUpdatedConfigs$1.getOutputMinFrameDuration;
                        iterable = (java.lang.Iterable) companionConfigurationManager$overrideUpdatedConfigs$1.Camera2StreamConfigurationMap;
                        companionAppConfiguration4 = (com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoFpsRanges;
                        companionAppConfiguration3 = (com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) companionConfigurationManager$overrideUpdatedConfigs$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        char c2 = 2;
                        boolean z2 = true;
                        boolean z3 = false;
                        z = z3;
                        c = c2;
                        if (!it.hasNext()) {
                            java.lang.Object next = it.next();
                            com.paypal.oslo.core.companion.domain.ConfigSection configSection = (com.paypal.oslo.core.companion.domain.ConfigSection) next;
                            java.util.Iterator<T> it3 = companionAppConfiguration4.getSections().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it3.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigSection) obj).getId(), configSection.getId())) {
                                    break;
                                }
                            }
                            com.paypal.oslo.core.companion.domain.ConfigSection configSection2 = (com.paypal.oslo.core.companion.domain.ConfigSection) obj;
                            if (configSection2 == null || configSection2.getResolver() == null) {
                                c2 = c;
                                z3 = z;
                                z2 = true;
                            } else {
                                java.util.Iterator it4 = configSection.getFields().iterator();
                                while (it4.hasNext()) {
                                    com.paypal.oslo.core.companion.domain.ConfigField configField = (com.paypal.oslo.core.companion.domain.ConfigField) it4.next();
                                    java.util.Iterator<T> it5 = configSection2.getFields().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it5.next();
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigField) obj2).getId(), configField.getId())) {
                                            break;
                                        }
                                    }
                                    com.paypal.oslo.core.companion.domain.ConfigField configField2 = (com.paypal.oslo.core.companion.domain.ConfigField) obj2;
                                    if (configField2 == null || kotlin.jvm.internal.Intrinsics.areEqual(configField.getValue(), configField2.getValue())) {
                                        it2 = it4;
                                    } else {
                                        it2 = it4;
                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Updating field", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fieldId", configField.getId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, configField.getValue())), null, 4, null);
                                        com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configSection2.getResolver();
                                        if (resolver != null) {
                                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(resolver.overrideValue(configField.getId(), configField.getValue()));
                                        }
                                    }
                                    it4 = it2;
                                }
                                z2 = true;
                                java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> subsections = configSection.getSubsections();
                                java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> subsections2 = configSection2.getSubsections();
                                com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver2 = configSection2.getResolver();
                                companionConfigurationManager$overrideUpdatedConfigs$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(companionAppConfiguration3);
                                companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoFpsRanges = companionAppConfiguration4;
                                companionConfigurationManager$overrideUpdatedConfigs$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                                companionConfigurationManager$overrideUpdatedConfigs$1.getOutputMinFrameDuration = it;
                                companionConfigurationManager$overrideUpdatedConfigs$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(configSection);
                                companionConfigurationManager$overrideUpdatedConfigs$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(configSection2);
                                companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoFpsRangesFor = i2;
                                z3 = false;
                                companionConfigurationManager$overrideUpdatedConfigs$1.getHighSpeedVideoSizes = 0;
                                c2 = 2;
                                companionConfigurationManager$overrideUpdatedConfigs$1.getOutputFormats = 2;
                            }
                            z = z3;
                            c = c2;
                            if (!it.hasNext()) {
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration6 = this.getHighSpeedVideoFpsRanges;
                    mutex.unlock(null);
                    java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> sections = companionAppConfiguration2.getSections();
                    companionAppConfiguration3 = companionAppConfiguration2;
                    companionAppConfiguration4 = companionAppConfiguration6;
                    it = sections.iterator();
                    iterable = sections;
                    i2 = 0;
                    if (!it.hasNext()) {
                    }
                }
            }
            com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration62 = this.getHighSpeedVideoFpsRanges;
            mutex.unlock(null);
            java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> sections2 = companionAppConfiguration2.getSections();
            companionAppConfiguration3 = companionAppConfiguration2;
            companionAppConfiguration4 = companionAppConfiguration62;
            it = sections2.iterator();
            iterable = sections2;
            i2 = 0;
            if (!it.hasNext()) {
            }
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        companionConfigurationManager$overrideUpdatedConfigs$1 = new com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedConfigs$1(this, continuation);
        java.lang.Object obj32 = companionConfigurationManager$overrideUpdatedConfigs$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = companionConfigurationManager$overrideUpdatedConfigs$1.getOutputFormats;
        char c3 = 2;
        boolean z4 = false;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ad -> B:11:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01b2 -> B:10:0x01bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list, java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list2, com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver configSectionFieldResolver, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedSubsections$1 companionConfigurationManager$overrideUpdatedSubsections$1;
        int i;
        java.lang.Object obj;
        com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedSubsections$1 companionConfigurationManager$overrideUpdatedSubsections$12;
        java.util.Iterator it;
        int i2;
        java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list3;
        java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list4;
        com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver configSectionFieldResolver2;
        java.lang.Object obj2;
        java.util.Iterator it2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager = this;
        if (continuation instanceof com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedSubsections$1) {
            companionConfigurationManager$overrideUpdatedSubsections$1 = (com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedSubsections$1) continuation;
            if ((companionConfigurationManager$overrideUpdatedSubsections$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                companionConfigurationManager$overrideUpdatedSubsections$1.getOutputSizes -= 2147483648;
                java.lang.Object obj5 = companionConfigurationManager$overrideUpdatedSubsections$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = companionConfigurationManager$overrideUpdatedSubsections$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj5);
                    java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list5 = list;
                    obj = list5;
                    companionConfigurationManager$overrideUpdatedSubsections$12 = companionConfigurationManager$overrideUpdatedSubsections$1;
                    it = list5.iterator();
                    i2 = 0;
                    list3 = list;
                    list4 = list2;
                    configSectionFieldResolver2 = configSectionFieldResolver;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = companionConfigurationManager$overrideUpdatedSubsections$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = companionConfigurationManager$overrideUpdatedSubsections$1.getHighSpeedVideoSizes;
                    java.lang.Object obj6 = companionConfigurationManager$overrideUpdatedSubsections$1.getOutputFormats;
                    java.util.Iterator it3 = (java.util.Iterator) companionConfigurationManager$overrideUpdatedSubsections$1.getOutputMinFrameDuration;
                    java.lang.Object obj7 = (java.lang.Iterable) companionConfigurationManager$overrideUpdatedSubsections$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver configSectionFieldResolver3 = (com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver) companionConfigurationManager$overrideUpdatedSubsections$1.Camera2StreamConfigurationMap;
                    java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list6 = (java.util.List) companionConfigurationManager$overrideUpdatedSubsections$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list7 = (java.util.List) companionConfigurationManager$overrideUpdatedSubsections$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj5);
                    com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager2 = companionConfigurationManager;
                    list3 = list7;
                    boolean z = true;
                    java.util.Iterator it4 = it3;
                    companionConfigurationManager$overrideUpdatedSubsections$12 = companionConfigurationManager$overrideUpdatedSubsections$1;
                    list4 = list6;
                    obj = obj7;
                    i2 = i4;
                    configSectionFieldResolver2 = configSectionFieldResolver3;
                    it = it4;
                    companionConfigurationManager = companionConfigurationManager2;
                    if (!it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.core.companion.domain.ConfigSection configSection = (com.paypal.oslo.core.companion.domain.ConfigSection) next;
                        java.util.Iterator<T> it5 = list4.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it5.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigSection) obj2).getId(), configSection.getId())) {
                                break;
                            }
                        }
                        com.paypal.oslo.core.companion.domain.ConfigSection configSection2 = (com.paypal.oslo.core.companion.domain.ConfigSection) obj2;
                        if (configSection2 != null) {
                            com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configSection2.getResolver();
                            if (resolver == null) {
                                resolver = configSectionFieldResolver2;
                            }
                            java.util.Iterator it6 = configSection.getFields().iterator();
                            while (it6.hasNext()) {
                                com.paypal.oslo.core.companion.domain.ConfigField configField = (com.paypal.oslo.core.companion.domain.ConfigField) it6.next();
                                java.util.Iterator<T> it7 = configSection2.getFields().iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        it2 = it6;
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it7.next();
                                    it2 = it6;
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigField) obj3).getId(), configField.getId())) {
                                        break;
                                    }
                                    it6 = it2;
                                }
                                com.paypal.oslo.core.companion.domain.ConfigField configField2 = (com.paypal.oslo.core.companion.domain.ConfigField) obj3;
                                if (configField2 == null || kotlin.jvm.internal.Intrinsics.areEqual(configField.getValue(), configField2.getValue())) {
                                    obj4 = coroutine_suspended;
                                } else {
                                    obj4 = coroutine_suspended;
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Updating subsection field", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("subsectionId", configSection.getId()), kotlin.TuplesKt.to("fieldId", configField.getId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, configField.getValue())), null, 4, null);
                                    if (resolver != null) {
                                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(resolver.overrideValue(configField.getId(), configField.getValue()));
                                    }
                                }
                                it6 = it2;
                                coroutine_suspended = obj4;
                            }
                            java.lang.Object obj8 = coroutine_suspended;
                            java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> subsections = configSection.getSubsections();
                            java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> subsections2 = configSection2.getSubsections();
                            companionConfigurationManager$overrideUpdatedSubsections$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                            companionConfigurationManager$overrideUpdatedSubsections$12.getHighResolutionOutputSizeshNQ4ISI = list4;
                            companionConfigurationManager$overrideUpdatedSubsections$12.Camera2StreamConfigurationMap = configSectionFieldResolver2;
                            companionConfigurationManager$overrideUpdatedSubsections$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                            companionConfigurationManager$overrideUpdatedSubsections$12.getOutputMinFrameDuration = it;
                            companionConfigurationManager$overrideUpdatedSubsections$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            companionConfigurationManager$overrideUpdatedSubsections$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(configSection);
                            companionConfigurationManager$overrideUpdatedSubsections$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(resolver);
                            companionConfigurationManager$overrideUpdatedSubsections$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(configSection2);
                            companionConfigurationManager$overrideUpdatedSubsections$12.getHighSpeedVideoSizes = i2;
                            companionConfigurationManager$overrideUpdatedSubsections$12.getHighSpeedVideoFpsRangesFor = 0;
                            z = true;
                            companionConfigurationManager$overrideUpdatedSubsections$12.getOutputSizes = 1;
                            companionConfigurationManager2 = this;
                            java.lang.Object highSpeedVideoFpsRanges = companionConfigurationManager2.getHighSpeedVideoFpsRanges(subsections, subsections2, resolver, companionConfigurationManager$overrideUpdatedSubsections$12);
                            coroutine_suspended = obj8;
                            if (highSpeedVideoFpsRanges == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            java.lang.Object obj9 = obj;
                            list6 = list4;
                            companionConfigurationManager$overrideUpdatedSubsections$1 = companionConfigurationManager$overrideUpdatedSubsections$12;
                            it3 = it;
                            configSectionFieldResolver3 = configSectionFieldResolver2;
                            i4 = i2;
                            obj7 = obj9;
                            java.util.Iterator it42 = it3;
                            companionConfigurationManager$overrideUpdatedSubsections$12 = companionConfigurationManager$overrideUpdatedSubsections$1;
                            list4 = list6;
                            obj = obj7;
                            i2 = i4;
                            configSectionFieldResolver2 = configSectionFieldResolver3;
                            it = it42;
                            companionConfigurationManager = companionConfigurationManager2;
                            if (!it.hasNext()) {
                                return kotlin.Unit.INSTANCE;
                            }
                        } else {
                            companionConfigurationManager2 = companionConfigurationManager;
                            z = true;
                            companionConfigurationManager = companionConfigurationManager2;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        companionConfigurationManager$overrideUpdatedSubsections$1 = new com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedSubsections$1(companionConfigurationManager, continuation);
        java.lang.Object obj52 = companionConfigurationManager$overrideUpdatedSubsections$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = companionConfigurationManager$overrideUpdatedSubsections$1.getOutputSizes;
        if (i != 0) {
        }
    }

    private final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> Camera2StreamConfigurationMap(java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> p0, java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> p1) {
        java.lang.Object obj;
        java.util.List<? extends com.paypal.oslo.core.companion.domain.ConfigSection> list = p1;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.companion.domain.ConfigSection) it.next()).getId());
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : p0) {
            if (set.contains(((com.paypal.oslo.core.companion.domain.ConfigSection) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList2);
        java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> list2 = mutableList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((com.paypal.oslo.core.companion.domain.ConfigSection) it2.next()).getId());
        }
        java.util.Set set2 = kotlin.collections.CollectionsKt.toSet(arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (!set2.contains(((com.paypal.oslo.core.companion.domain.ConfigSection) obj3).getId())) {
                arrayList4.add(obj3);
            }
        }
        mutableList.addAll(arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (final com.paypal.oslo.core.companion.domain.ConfigSection configSection : list2) {
            java.util.Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigSection) obj).getId(), configSection.getId())) {
                    break;
                }
            }
            final com.paypal.oslo.core.companion.domain.ConfigSection configSection2 = (com.paypal.oslo.core.companion.domain.ConfigSection) obj;
            if (configSection2 != null) {
                java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields = configSection2.getFields();
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fields, 10));
                java.util.Iterator<T> it4 = fields.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((com.paypal.oslo.core.companion.domain.ConfigField) it4.next()).getId());
                }
                java.util.Set set3 = kotlin.collections.CollectionsKt.toSet(arrayList6);
                java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields2 = configSection.getFields();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                for (java.lang.Object obj4 : fields2) {
                    if (set3.contains(((com.paypal.oslo.core.companion.domain.ConfigField) obj4).getId())) {
                        arrayList7.add(obj4);
                    }
                }
                final java.util.ArrayList arrayList8 = arrayList7;
                java.util.ArrayList arrayList9 = arrayList8;
                java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                java.util.Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    arrayList10.add(((com.paypal.oslo.core.companion.domain.ConfigField) it5.next()).getId());
                }
                java.util.Set set4 = kotlin.collections.CollectionsKt.toSet(arrayList10);
                java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields3 = configSection2.getFields();
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                for (java.lang.Object obj5 : fields3) {
                    if (!set4.contains(((com.paypal.oslo.core.companion.domain.ConfigField) obj5).getId())) {
                        arrayList11.add(obj5);
                    }
                }
                final java.util.ArrayList arrayList12 = arrayList11;
                final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(configSection.getSubsections(), configSection2.getSubsections());
                configSection = new com.paypal.oslo.core.companion.domain.ConfigSection(configSection, arrayList8, arrayList12, Camera2StreamConfigurationMap, configSection2) { // from class: com.paypal.oslo.core.companion.data.CompanionConfigurationManager$mergeSubsections$1$1
                    private final java.lang.String description;
                    private final java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields;
                    private final java.lang.String id;
                    private final java.lang.String name;
                    private final com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver;
                    private final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> subsections;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.id = configSection.getId();
                        this.name = configSection.getName();
                        this.description = configSection.getDescription();
                        this.fields = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList8, (java.lang.Iterable) arrayList12);
                        this.subsections = Camera2StreamConfigurationMap;
                        this.resolver = configSection2.getResolver();
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.lang.String getId() {
                        return this.id;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.lang.String getName() {
                        return this.name;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.lang.String getDescription() {
                        return this.description;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> getFields() {
                        return this.fields;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> getSubsections() {
                        return this.subsections;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver getResolver() {
                        return this.resolver;
                    }
                };
            }
            arrayList5.add(configSection);
        }
        return arrayList5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.companion.data.CompanionConfigurationManager$updateCurrentConfiguration$1 companionConfigurationManager$updateCurrentConfiguration$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.paypal.oslo.core.companion.data.CompanionConfigurationManager$updateCurrentConfiguration$1) {
                companionConfigurationManager$updateCurrentConfiguration$1 = (com.paypal.oslo.core.companion.data.CompanionConfigurationManager$updateCurrentConfiguration$1) continuation;
                if ((companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = companionConfigurationManager$updateCurrentConfiguration$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.getHighResolutionOutputSizeshNQ4ISI;
                        companionConfigurationManager$updateCurrentConfiguration$1.Camera2StreamConfigurationMap = companionAppConfiguration;
                        companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoFpsRanges = mutex;
                        companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoSizes = 0;
                        companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, companionConfigurationManager$updateCurrentConfiguration$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoSizes;
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration2 = (com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) companionConfigurationManager$updateCurrentConfiguration$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        companionAppConfiguration = companionAppConfiguration2;
                    }
                    this.getHighSpeedVideoFpsRanges = companionAppConfiguration;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Updated current configuration", null, null, 6, null);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            this.getHighSpeedVideoFpsRanges = companionAppConfiguration;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Updated current configuration", null, null, 6, null);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        companionConfigurationManager$updateCurrentConfiguration$1 = new com.paypal.oslo.core.companion.data.CompanionConfigurationManager$updateCurrentConfiguration$1(this, continuation);
        java.lang.Object obj2 = companionConfigurationManager$updateCurrentConfiguration$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = companionConfigurationManager$updateCurrentConfiguration$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    public static final /* synthetic */ com.paypal.oslo.core.companion.domain.CompanionAppConfiguration access$mergeWithDefaultConfig(com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager, com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration) {
        java.lang.Object obj;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.companion.LoggerKt.log, "Merging cached configuration with default configuration", null, null, 6, null);
        java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> sections = companionConfigurationManager.getHighSpeedVideoFpsRangesFor.getSections();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sections, 10));
        java.util.Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.companion.domain.ConfigSection) it.next()).getId());
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
        java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> sections2 = companionAppConfiguration.getSections();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : sections2) {
            if (set.contains(((com.paypal.oslo.core.companion.domain.ConfigSection) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList2);
        java.util.List list = mutableList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((com.paypal.oslo.core.companion.domain.ConfigSection) it2.next()).getId());
        }
        java.util.Set set2 = kotlin.collections.CollectionsKt.toSet(arrayList3);
        java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> sections3 = companionConfigurationManager.getHighSpeedVideoFpsRangesFor.getSections();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : sections3) {
            if (!set2.contains(((com.paypal.oslo.core.companion.domain.ConfigSection) obj3).getId())) {
                arrayList4.add(obj3);
            }
        }
        mutableList.addAll(arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj4 : list) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            final com.paypal.oslo.core.companion.domain.ConfigSection configSection = (com.paypal.oslo.core.companion.domain.ConfigSection) obj4;
            java.util.Iterator<T> it3 = companionConfigurationManager.getHighSpeedVideoFpsRangesFor.getSections().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.companion.domain.ConfigSection) obj).getId(), configSection.getId())) {
                    break;
                }
            }
            final com.paypal.oslo.core.companion.domain.ConfigSection configSection2 = (com.paypal.oslo.core.companion.domain.ConfigSection) obj;
            if (configSection2 != null) {
                java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields = configSection2.getFields();
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fields, 10));
                java.util.Iterator<T> it4 = fields.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((com.paypal.oslo.core.companion.domain.ConfigField) it4.next()).getId());
                }
                java.util.Set set3 = kotlin.collections.CollectionsKt.toSet(arrayList6);
                java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields2 = configSection.getFields();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                for (java.lang.Object obj5 : fields2) {
                    if (set3.contains(((com.paypal.oslo.core.companion.domain.ConfigField) obj5).getId())) {
                        arrayList7.add(obj5);
                    }
                }
                final java.util.ArrayList arrayList8 = arrayList7;
                java.util.ArrayList arrayList9 = arrayList8;
                java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                java.util.Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    arrayList10.add(((com.paypal.oslo.core.companion.domain.ConfigField) it5.next()).getId());
                }
                java.util.Set set4 = kotlin.collections.CollectionsKt.toSet(arrayList10);
                java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields3 = configSection2.getFields();
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                for (java.lang.Object obj6 : fields3) {
                    if (!set4.contains(((com.paypal.oslo.core.companion.domain.ConfigField) obj6).getId())) {
                        arrayList11.add(obj6);
                    }
                }
                final java.util.ArrayList arrayList12 = arrayList11;
                final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> Camera2StreamConfigurationMap = companionConfigurationManager.Camera2StreamConfigurationMap(configSection.getSubsections(), configSection2.getSubsections());
                configSection = new com.paypal.oslo.core.companion.domain.ConfigSection(configSection, arrayList8, arrayList12, Camera2StreamConfigurationMap, configSection2) { // from class: com.paypal.oslo.core.companion.data.CompanionConfigurationManager$mergeWithDefaultConfig$processedSections$1$1
                    private final java.lang.String description;
                    private final java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> fields;
                    private final java.lang.String id;
                    private final java.lang.String name;
                    private final com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver;
                    private final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> subsections;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.id = configSection.getId();
                        this.name = configSection.getName();
                        this.description = configSection.getDescription();
                        this.fields = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList8, (java.lang.Iterable) arrayList12);
                        this.subsections = Camera2StreamConfigurationMap;
                        this.resolver = configSection2.getResolver();
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.lang.String getId() {
                        return this.id;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.lang.String getName() {
                        return this.name;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.lang.String getDescription() {
                        return this.description;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> getFields() {
                        return this.fields;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> getSubsections() {
                        return this.subsections;
                    }

                    @Override // com.paypal.oslo.core.companion.domain.ConfigSection
                    public final com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver getResolver() {
                        return this.resolver;
                    }
                };
            }
            arrayList5.add(configSection);
            i++;
        }
        return new com.paypal.oslo.core.companion.domain.CompanionAppConfiguration(arrayList5);
    }
}
