package androidx.view.result;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 >2\u00020\u0001:\u0003?@>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b!\u0010\u001fJ'\u0010&\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010'J#\u0010&\u001a\u00020%\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00028\u0000¢\u0006\u0004\b&\u0010)J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u001bJ\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u00100R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u000205018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0010068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00107R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u000309018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R\"\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u0014\u0010=\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "", "key", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/activity/result/ActivityResultCallback;", com.sun.jna.Callback.METHOD_NAME, "Landroidx/activity/result/ActivityResultLauncher;", "register", "(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "unregister$activity", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onRestoreInstanceState", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "dispatchResult", "(IILandroid/content/Intent;)Z", "result", "(ILjava/lang/Object;)Z", "p0", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "()I", "p1", "getHighSpeedVideoFpsRangesFor", "(ILjava/lang/String;)V", "", "getInputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "Landroid/os/Bundle;", "getInputFormats", "Companion", "CallbackAndContract", "LifecycleContainer"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private static final androidx.activity.result.ActivityResultRegistry.Companion Companion = new androidx.activity.result.ActivityResultRegistry.Companion(null);

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Integer, java.lang.String> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Integer> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    private final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.LifecycleContainer> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final transient java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?>> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizesFor = new java.util.LinkedHashMap();

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final android.os.Bundle getInputFormats = new android.os.Bundle();

    public abstract <I, O> void onLaunch(int requestCode, androidx.view.result.contract.ActivityResultContract<I, O> contract, I input, androidx.core.app.ActivityOptionsCompat options);

    public final <I, O> androidx.view.result.ActivityResultLauncher<I> register(final java.lang.String key, androidx.view.LifecycleOwner lifecycleOwner, final androidx.view.result.contract.ActivityResultContract<I, O> contract, final androidx.view.result.ActivityResultCallback<O> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contract, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        androidx.view.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LifecycleOwner ");
            sb.append(lifecycleOwner);
            sb.append(" is attempting to register while current state is ");
            sb.append(lifecycle.getCamera2StreamConfigurationMap());
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        getHighSpeedVideoSizes(key);
        androidx.activity.result.ActivityResultRegistry.LifecycleContainer lifecycleContainer = this.getHighSpeedVideoFpsRangesFor.get(key);
        if (lifecycleContainer == null) {
            lifecycleContainer = new androidx.activity.result.ActivityResultRegistry.LifecycleContainer(lifecycle);
        }
        androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda0
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                androidx.view.result.ActivityResultRegistry.m25$r8$lambda$TWvtyPFkiHdx0RbtWVLevVLT0(androidx.view.result.ActivityResultRegistry.this, key, callback, contract, lifecycleOwner2, event);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleEventObserver, "");
        lifecycleContainer.Camera2StreamConfigurationMap.addObserver(lifecycleEventObserver);
        lifecycleContainer.getHighResolutionOutputSizeshNQ4ISI.add(lifecycleEventObserver);
        this.getHighSpeedVideoFpsRangesFor.put(key, lifecycleContainer);
        return new androidx.view.result.ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry$register$2
            @Override // androidx.view.result.ActivityResultLauncher
            public final void launch(I input, androidx.core.app.ActivityOptionsCompat options) {
                java.util.Map map;
                java.util.List list;
                java.util.List list2;
                map = androidx.view.result.ActivityResultRegistry.this.Camera2StreamConfigurationMap;
                java.lang.Object obj = map.get(key);
                java.lang.Object obj2 = contract;
                if (obj != null) {
                    int intValue = ((java.lang.Number) obj).intValue();
                    list = androidx.view.result.ActivityResultRegistry.this.getHighResolutionOutputSizeshNQ4ISI;
                    list.add(key);
                    try {
                        androidx.view.result.ActivityResultRegistry.this.onLaunch(intValue, contract, input, options);
                        return;
                    } catch (java.lang.Exception e) {
                        list2 = androidx.view.result.ActivityResultRegistry.this.getHighResolutionOutputSizeshNQ4ISI;
                        list2.remove(key);
                        throw e;
                    }
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sb2.append(obj2);
                sb2.append(" and input ");
                sb2.append(input);
                sb2.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new java.lang.IllegalStateException(sb2.toString().toString());
            }

            @Override // androidx.view.result.ActivityResultLauncher
            public final void unregister() {
                androidx.view.result.ActivityResultRegistry.this.unregister$activity(key);
            }

            @Override // androidx.view.result.ActivityResultLauncher
            public final androidx.view.result.contract.ActivityResultContract<I, ?> getContract() {
                return (androidx.view.result.contract.ActivityResultContract<I, ?>) contract;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.view.result.ActivityResultLauncher<I> register(final java.lang.String key, final androidx.view.result.contract.ActivityResultContract<I, O> contract, androidx.view.result.ActivityResultCallback<O> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contract, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        getHighSpeedVideoSizes(key);
        this.getHighSpeedVideoSizes.put(key, new androidx.activity.result.ActivityResultRegistry.CallbackAndContract<>(callback, contract));
        if (this.getHighSpeedVideoSizesFor.containsKey(key)) {
            java.lang.Object obj = this.getHighSpeedVideoSizesFor.get(key);
            this.getHighSpeedVideoSizesFor.remove(key);
            callback.onActivityResult(obj);
        }
        androidx.view.result.ActivityResult activityResult = (androidx.view.result.ActivityResult) androidx.core.os.BundleCompat.getParcelable(this.getInputFormats, key, androidx.view.result.ActivityResult.class);
        if (activityResult != null) {
            this.getInputFormats.remove(key);
            callback.onActivityResult(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new androidx.view.result.ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry$register$3
            @Override // androidx.view.result.ActivityResultLauncher
            public final void launch(I input, androidx.core.app.ActivityOptionsCompat options) {
                java.util.Map map;
                java.util.List list;
                java.util.List list2;
                map = androidx.view.result.ActivityResultRegistry.this.Camera2StreamConfigurationMap;
                java.lang.Object obj2 = map.get(key);
                java.lang.Object obj3 = contract;
                if (obj2 != null) {
                    int intValue = ((java.lang.Number) obj2).intValue();
                    list = androidx.view.result.ActivityResultRegistry.this.getHighResolutionOutputSizeshNQ4ISI;
                    list.add(key);
                    try {
                        androidx.view.result.ActivityResultRegistry.this.onLaunch(intValue, contract, input, options);
                        return;
                    } catch (java.lang.Exception e) {
                        list2 = androidx.view.result.ActivityResultRegistry.this.getHighResolutionOutputSizeshNQ4ISI;
                        list2.remove(key);
                        throw e;
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sb.append(obj3);
                sb.append(" and input ");
                sb.append(input);
                sb.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }

            @Override // androidx.view.result.ActivityResultLauncher
            public final void unregister() {
                androidx.view.result.ActivityResultRegistry.this.unregister$activity(key);
            }

            @Override // androidx.view.result.ActivityResultLauncher
            public final androidx.view.result.contract.ActivityResultContract<I, ?> getContract() {
                return (androidx.view.result.contract.ActivityResultContract<I, ?>) contract;
            }
        };
    }

    public final void unregister$activity(java.lang.String key) {
        java.lang.Integer remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (!this.getHighResolutionOutputSizeshNQ4ISI.contains(key) && (remove = this.Camera2StreamConfigurationMap.remove(key)) != null) {
            this.getHighSpeedVideoFpsRanges.remove(remove);
        }
        this.getHighSpeedVideoSizes.remove(key);
        if (this.getHighSpeedVideoSizesFor.containsKey(key)) {
            this.getHighSpeedVideoSizesFor.get(key);
            this.getHighSpeedVideoSizesFor.remove(key);
        }
        if (this.getInputFormats.containsKey(key)) {
            this.getInputFormats.remove(key);
        }
        androidx.activity.result.ActivityResultRegistry.LifecycleContainer lifecycleContainer = this.getHighSpeedVideoFpsRangesFor.get(key);
        if (lifecycleContainer != null) {
            java.util.Iterator<T> it = lifecycleContainer.getHighResolutionOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                lifecycleContainer.Camera2StreamConfigurationMap.removeObserver((androidx.view.LifecycleEventObserver) it.next());
            }
            lifecycleContainer.getHighResolutionOutputSizeshNQ4ISI.clear();
            this.getHighSpeedVideoFpsRangesFor.remove(key);
        }
    }

    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList<>(this.Camera2StreamConfigurationMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList<>(this.Camera2StreamConfigurationMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList<>(this.getHighResolutionOutputSizeshNQ4ISI));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new android.os.Bundle(this.getInputFormats));
    }

    public final void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            java.util.ArrayList<java.lang.Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            java.util.ArrayList<java.lang.String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.addAll(stringArrayList2);
            }
            android.os.Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                this.getInputFormats.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                java.lang.String str = stringArrayList.get(i);
                if (this.Camera2StreamConfigurationMap.containsKey(str)) {
                    java.lang.Integer remove = this.Camera2StreamConfigurationMap.remove(str);
                    if (!this.getInputFormats.containsKey(str)) {
                        kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.getHighSpeedVideoFpsRanges).remove(remove);
                    }
                }
                java.lang.Integer num = integerArrayList.get(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
                int intValue = num.intValue();
                java.lang.String str2 = stringArrayList.get(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                getHighSpeedVideoFpsRangesFor(intValue, str2);
            }
        }
    }

    public final boolean dispatchResult(int requestCode, int resultCode, android.content.Intent data) {
        java.lang.String str = this.getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?> callbackAndContract = this.getHighSpeedVideoSizes.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getHighResolutionOutputSizeshNQ4ISI() : null) != null && this.getHighResolutionOutputSizeshNQ4ISI.contains(str)) {
            callbackAndContract.getHighResolutionOutputSizeshNQ4ISI().onActivityResult(callbackAndContract.getHighSpeedVideoSizes().parseResult(resultCode, data));
            this.getHighResolutionOutputSizeshNQ4ISI.remove(str);
            return true;
        }
        this.getHighSpeedVideoSizesFor.remove(str);
        this.getInputFormats.putParcelable(str, new androidx.view.result.ActivityResult(resultCode, data));
        return true;
    }

    public final <O> boolean dispatchResult(int requestCode, O result) {
        java.lang.String str = this.getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?> callbackAndContract = this.getHighSpeedVideoSizes.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getHighResolutionOutputSizeshNQ4ISI() : null) == null) {
            this.getInputFormats.remove(str);
            this.getHighSpeedVideoSizesFor.put(str, result);
            return true;
        }
        androidx.view.result.ActivityResultCallback<?> highResolutionOutputSizeshNQ4ISI = callbackAndContract.getHighResolutionOutputSizeshNQ4ISI();
        kotlin.jvm.internal.Intrinsics.checkNotNull(highResolutionOutputSizeshNQ4ISI, "");
        if (!this.getHighResolutionOutputSizeshNQ4ISI.remove(str)) {
            return true;
        }
        highResolutionOutputSizeshNQ4ISI.onActivityResult(result);
        return true;
    }

    private final void getHighSpeedVideoSizes(java.lang.String p0) {
        if (this.Camera2StreamConfigurationMap.get(p0) != null) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap(), p0);
    }

    private final int Camera2StreamConfigurationMap() {
        for (java.lang.Number number : kotlin.sequences.SequencesKt.generateSequence(new kotlin.jvm.functions.Function0() { // from class: androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(kotlin.random.Random.INSTANCE.nextInt(2147418112) + 65536);
                return valueOf;
            }
        })) {
            if (!this.getHighSpeedVideoFpsRanges.containsKey(java.lang.Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new java.util.NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, java.lang.String p1) {
        this.getHighSpeedVideoFpsRanges.put(java.lang.Integer.valueOf(p0), p1);
        this.Camera2StreamConfigurationMap.put(p1, java.lang.Integer.valueOf(p0));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "", "Landroidx/activity/result/ActivityResultCallback;", "p0", "Landroidx/activity/result/contract/ActivityResultContract;", "p1", "<init>", "(Landroidx/activity/result/ActivityResultCallback;Landroidx/activity/result/contract/ActivityResultContract;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/activity/result/ActivityResultCallback;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/activity/result/ActivityResultCallback;", "getHighSpeedVideoSizes", "Landroidx/activity/result/contract/ActivityResultContract;", "()Landroidx/activity/result/contract/ActivityResultContract;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class CallbackAndContract<O> {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.view.result.ActivityResultCallback<O> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.view.result.contract.ActivityResultContract<?, O> getHighSpeedVideoFpsRanges;

        public CallbackAndContract(androidx.view.result.ActivityResultCallback<O> activityResultCallback, androidx.view.result.contract.ActivityResultContract<?, O> activityResultContract) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultCallback, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultContract, "");
            this.getHighResolutionOutputSizeshNQ4ISI = activityResultCallback;
            this.getHighSpeedVideoFpsRanges = activityResultContract;
        }

        public final androidx.view.result.ActivityResultCallback<O> getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.view.result.contract.ActivityResultContract<?, O> getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "Landroidx/lifecycle/Lifecycle;", "p0", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/Lifecycle;", "Camera2StreamConfigurationMap", "", "Landroidx/lifecycle/LifecycleEventObserver;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class LifecycleContainer {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final androidx.view.Lifecycle Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.util.List<androidx.view.LifecycleEventObserver> getHighResolutionOutputSizeshNQ4ISI;

        public LifecycleContainer(androidx.view.Lifecycle lifecycle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
            this.Camera2StreamConfigurationMap = lifecycle;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$TWvtyPFk-iHdx0R-btWVLevVLT0, reason: not valid java name */
    public static /* synthetic */ void m25$r8$lambda$TWvtyPFkiHdx0RbtWVLevVLT0(androidx.view.result.ActivityResultRegistry activityResultRegistry, java.lang.String str, androidx.view.result.ActivityResultCallback activityResultCallback, androidx.view.result.contract.ActivityResultContract activityResultContract, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (androidx.lifecycle.Lifecycle.Event.ON_START != event) {
            if (androidx.lifecycle.Lifecycle.Event.ON_STOP == event) {
                activityResultRegistry.getHighSpeedVideoSizes.remove(str);
                return;
            } else {
                if (androidx.lifecycle.Lifecycle.Event.ON_DESTROY == event) {
                    activityResultRegistry.unregister$activity(str);
                    return;
                }
                return;
            }
        }
        activityResultRegistry.getHighSpeedVideoSizes.put(str, new androidx.activity.result.ActivityResultRegistry.CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (activityResultRegistry.getHighSpeedVideoSizesFor.containsKey(str)) {
            java.lang.Object obj = activityResultRegistry.getHighSpeedVideoSizesFor.get(str);
            activityResultRegistry.getHighSpeedVideoSizesFor.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        androidx.view.result.ActivityResult activityResult = (androidx.view.result.ActivityResult) androidx.core.os.BundleCompat.getParcelable(activityResultRegistry.getInputFormats, str, androidx.view.result.ActivityResult.class);
        if (activityResult != null) {
            activityResultRegistry.getInputFormats.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
    }
}
