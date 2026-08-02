package androidx.view.result.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts;", "", "<init>", "()V", "StartActivityForResult", "StartIntentSenderForResult", "RequestMultiplePermissions", "RequestPermission", "TakePicturePreview", "TakePicture", "TakeVideo", "CaptureVideo", "PickContact", "GetContent", "GetMultipleContents", "OpenDocument", "OpenMultipleDocuments", "OpenDocumentTree", "CreateDocument", "PickVisualMedia", "PickMultipleVisualMedia"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityResultContracts {
    private ActivityResultContracts() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "createIntent", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroidx/activity/result/ActivityResult;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartActivityForResult extends androidx.view.result.contract.ActivityResultContract<android.content.Intent, androidx.view.result.ActivityResult> {
        public static final java.lang.String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.view.result.ActivityResult parseResult(int resultCode, android.content.Intent intent) {
            return new androidx.view.result.ActivityResult(resultCode, intent);
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.content.Intent createIntent(android.content.Context context, android.content.Intent input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return input;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroidx/activity/result/IntentSenderRequest;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroidx/activity/result/ActivityResult;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class StartIntentSenderForResult extends androidx.view.result.contract.ActivityResultContract<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> {
        public static final java.lang.String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final java.lang.String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final java.lang.String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.content.Intent createIntent(android.content.Context context, androidx.view.result.IntentSenderRequest input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent putExtra = new android.content.Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, input);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.view.result.ActivityResult parseResult(int resultCode, android.content.Intent intent) {
            return new androidx.view.result.ActivityResult(resultCode, intent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0010\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/Map;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RequestMultiplePermissions extends androidx.view.result.contract.ActivityResultContract<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> {
        public static final java.lang.String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion(null);
        public static final java.lang.String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final java.lang.String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "<init>", "()V", "", "", "input", "Landroid/content/Intent;", "createIntent$activity", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final android.content.Intent createIntent$activity(java.lang.String[] input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                android.content.Intent putExtra = new android.content.Intent(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, input);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "");
                return putExtra;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.content.Intent createIntent(android.content.Context context, java.lang.String[] input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return INSTANCE.createIntent$activity(input);
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult(android.content.Context context, java.lang.String[] input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            if (input.length == 0) {
                return new androidx.activity.result.contract.ActivityResultContract.SynchronousResult<>(kotlin.collections.MapsKt.emptyMap());
            }
            for (java.lang.String str : input) {
                if (androidx.core.content.ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(input.length), 16));
            for (java.lang.String str2 : input) {
                kotlin.Pair pair = kotlin.TuplesKt.to(str2, java.lang.Boolean.TRUE);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return new androidx.activity.result.contract.ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final java.util.Map<java.lang.String, java.lang.Boolean> parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                return kotlin.collections.MapsKt.emptyMap();
            }
            if (intent == null) {
                return kotlin.collections.MapsKt.emptyMap();
            }
            java.lang.String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return kotlin.collections.MapsKt.emptyMap();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(intArrayExtra.length);
            for (int i : intArrayExtra) {
                arrayList.add(java.lang.Boolean.valueOf(i == 0));
            }
            return kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.zip(kotlin.collections.ArraysKt.filterNotNull(stringArrayExtra), arrayList));
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class RequestPermission extends androidx.view.result.contract.ActivityResultContract<java.lang.String, java.lang.Boolean> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.content.Intent createIntent(android.content.Context context, java.lang.String input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.INSTANCE.createIntent$activity(new java.lang.String[]{input});
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int resultCode, android.content.Intent intent) {
            if (intent == null || resultCode != -1) {
                return java.lang.Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
            boolean z = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (intArrayExtra[i] == 0) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            return java.lang.Boolean.valueOf(z);
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context context, java.lang.String input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            if (androidx.core.content.ContextCompat.checkSelfPermission(context, input) == 0) {
                return new androidx.activity.result.contract.ActivityResultContract.SynchronousResult<>(java.lang.Boolean.TRUE);
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/Void;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/Void;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/graphics/Bitmap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class TakePicturePreview extends androidx.view.result.contract.ActivityResultContract<java.lang.Void, android.graphics.Bitmap> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.Void input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent addFlags = new android.content.Intent("android.media.action.IMAGE_CAPTURE").addFlags(1).addFlags(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags, "");
            return addFlags;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return (android.graphics.Bitmap) intent.getParcelableExtra(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            }
            return null;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context context, java.lang.Void input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Landroid/net/Uri;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Boolean;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class TakePicture extends androidx.view.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.net.Uri input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent addFlags = new android.content.Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input).addFlags(1).addFlags(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags, "");
            return addFlags;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int resultCode, android.content.Intent intent) {
            return java.lang.Boolean.valueOf(resultCode == -1);
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context context, android.net.Uri input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakeVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Landroid/net/Uri;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/graphics/Bitmap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.Deprecated(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class TakeVideo extends androidx.view.result.contract.ActivityResultContract<android.net.Uri, android.graphics.Bitmap> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.net.Uri input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent addFlags = new android.content.Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input).addFlags(1).addFlags(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags, "");
            return addFlags;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return (android.graphics.Bitmap) intent.getParcelableExtra(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            }
            return null;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context context, android.net.Uri input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CaptureVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Landroid/net/Uri;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Boolean;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class CaptureVideo extends androidx.view.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.net.Uri input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent addFlags = new android.content.Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input).addFlags(1).addFlags(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags, "");
            return addFlags;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int resultCode, android.content.Intent intent) {
            return java.lang.Boolean.valueOf(resultCode == -1);
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context context, android.net.Uri input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickContact;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/Void;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class PickContact extends androidx.view.result.contract.ActivityResultContract<java.lang.Void, android.net.Uri> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.content.Intent createIntent(android.content.Context context, java.lang.Void input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent type = new android.content.Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetContent;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class GetContent extends androidx.view.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent type = new android.content.Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, java.lang.String input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00162\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class GetMultipleContents extends androidx.view.result.contract.ActivityResultContract<java.lang.String, java.util.List<android.net.Uri>> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion(null);

        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent putExtra = new android.content.Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "");
            return putExtra;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final java.util.List<android.net.Uri> parseResult(int resultCode, android.content.Intent intent) {
            java.util.List<android.net.Uri> clipDataUris$activity;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity = INSTANCE.getClipDataUris$activity(intent)) == null) ? kotlin.collections.CollectionsKt.emptyList() : clipDataUris$activity;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "<init>", "()V", "Landroid/content/Intent;", "", "Landroid/net/Uri;", "getClipDataUris$activity", "(Landroid/content/Intent;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.util.List<android.net.Uri> getClipDataUris$activity(android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                android.net.Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                android.content.ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        android.net.Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new java.util.ArrayList(linkedHashSet);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context context, java.lang.String input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class OpenDocument extends androidx.view.result.contract.ActivityResultContract<java.lang.String[], android.net.Uri> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String[] input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent type = new android.content.Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, java.lang.String[] input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class OpenMultipleDocuments extends androidx.view.result.contract.ActivityResultContract<java.lang.String[], java.util.List<android.net.Uri>> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String[] input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent type = new android.content.Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            return type;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final java.util.List<android.net.Uri> parseResult(int resultCode, android.content.Intent intent) {
            java.util.List<android.net.Uri> clipDataUris$activity;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.INSTANCE.getClipDataUris$activity(intent)) == null) ? kotlin.collections.CollectionsKt.emptyList() : clipDataUris$activity;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context context, java.lang.String[] input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Landroid/net/Uri;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class OpenDocumentTree extends androidx.view.result.contract.ActivityResultContract<android.net.Uri, android.net.Uri> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.net.Uri input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (input != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", input);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, android.net.Uri input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;)V", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class CreateDocument extends androidx.view.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public CreateDocument(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @kotlin.Deprecated(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @kotlin.ReplaceWith(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public CreateDocument() {
            this("*/*");
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, java.lang.String input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            android.content.Intent putExtra = new android.content.Intent("android.intent.action.CREATE_DOCUMENT").setType(this.getHighSpeedVideoFpsRangesFor).putExtra("android.intent.extra.TITLE", input);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, java.lang.String input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u0000 \u00142\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;", "Companion", "VisualMediaType", "ImageOnly", "VideoOnly", "ImageAndVideo", "SingleMimeType", "MediaCapabilities", "DefaultTab"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class PickVisualMedia extends androidx.view.result.contract.ActivityResultContract<androidx.view.result.PickVisualMediaRequest, android.net.Uri> {
        public static final java.lang.String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion(null);
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER";
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB";
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final java.lang.String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final java.lang.String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface VisualMediaType {
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$Companion;", "", "<init>", "()V", "", "isPhotoPickerAvailable", "()Z", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Z", "isSystemPickerAvailable$activity", "isSystemFallbackPickerAvailable$activity", "Landroid/content/pm/ResolveInfo;", "getSystemFallbackPicker$activity", "(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "input", "", "getVisualMimeType$activity", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Ljava/lang/String;", "ACTION_SYSTEM_FALLBACK_PICK_IMAGES", "Ljava/lang/String;", "GMS_ACTION_PICK_IMAGES", "GMS_EXTRA_PICK_IMAGES_MAX", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @kotlin.jvm.JvmStatic
            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity();
            }

            @kotlin.jvm.JvmStatic
            public final boolean isPhotoPickerAvailable(android.content.Context context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return isSystemPickerAvailable$activity() || isSystemFallbackPickerAvailable$activity(context);
            }

            @kotlin.jvm.JvmStatic
            public final boolean isSystemPickerAvailable$activity() {
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    return true;
                }
                return android.os.Build.VERSION.SDK_INT >= 30 && android.os.ext.SdkExtensions.getExtensionVersion(30) >= 2;
            }

            @kotlin.jvm.JvmStatic
            public final boolean isSystemFallbackPickerAvailable$activity(android.content.Context context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return getSystemFallbackPicker$activity(context) != null;
            }

            @kotlin.jvm.JvmStatic
            public final android.content.pm.ResolveInfo getSystemFallbackPicker$activity(android.content.Context context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return context.getPackageManager().resolveActivity(new android.content.Intent(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), androidx.media3.common.util.ParsableByteArray.INVALID_CODE_POINT);
            }

            public final java.lang.String getVisualMimeType$activity(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly) {
                    return "image/*";
                }
                if (input instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly) {
                    return androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED;
                }
                if (input instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.SingleMimeType) {
                    return ((androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.SingleMimeType) input).getMimeType();
                }
                if (input instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo) {
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ImageOnly implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly();

            private ImageOnly() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class VideoOnly implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly();

            private VideoOnly() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ImageAndVideo implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SingleMimeType implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            private final java.lang.String mimeType;

            public SingleMimeType(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.mimeType = str;
            }

            public final java.lang.String getMimeType() {
                return this.mimeType;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "", "<init>", "()V", "Landroid/media/ApplicationMediaCapabilities;", "toApplicationMediaCapabilities$activity", "()Landroid/media/ApplicationMediaCapabilities;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "supportedHdrTypes", "Ljava/util/Set;", "getSupportedHdrTypes", "()Ljava/util/Set;", "setSupportedHdrTypes$activity", "(Ljava/util/Set;)V", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MediaCapabilities {
            public static final int TYPE_DOLBY_VISION = 3;
            public static final int TYPE_HDR10 = 1;
            public static final int TYPE_HDR10_PLUS = 2;
            public static final int TYPE_HLG10 = 0;
            private java.util.Set<java.lang.Integer> supportedHdrTypes = kotlin.collections.SetsKt.emptySet();

            public final java.util.Set<java.lang.Integer> getSupportedHdrTypes() {
                return this.supportedHdrTypes;
            }

            public final void setSupportedHdrTypes$activity(java.util.Set<java.lang.Integer> set) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
                this.supportedHdrTypes = set;
            }

            public final android.media.ApplicationMediaCapabilities toApplicationMediaCapabilities$activity() {
                android.media.ApplicationMediaCapabilities.Builder builder = new android.media.ApplicationMediaCapabilities.Builder();
                builder.addSupportedVideoMimeType(androidx.media3.common.MimeTypes.VIDEO_H265);
                java.util.Iterator<T> it = this.supportedHdrTypes.iterator();
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    if (intValue == 0) {
                        builder.addSupportedHdrType("android.media.feature.hdr.hlg");
                    } else if (intValue == 1) {
                        builder.addSupportedHdrType("android.media.feature.hdr.hdr10");
                    } else if (intValue == 2) {
                        builder.addSupportedHdrType("android.media.feature.hdr.hdr10_plus");
                    } else if (intValue == 3) {
                        builder.addSupportedHdrType("android.media.feature.hdr.dolby_vision");
                    }
                }
                android.media.ApplicationMediaCapabilities build = builder.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                return build;
            }

            @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities$Builder;", "", "<init>", "()V", "", "hdrType", "addSupportedHdrType", "(I)Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities$Builder;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "build", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Builder {

                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
                private java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();

                public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities.Builder addSupportedHdrType(int hdrType) {
                    this.getHighSpeedVideoFpsRanges.add(java.lang.Integer.valueOf(hdrType));
                    return this;
                }

                public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities build() {
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities();
                    mediaCapabilities.setSupportedHdrTypes$activity(this.getHighSpeedVideoFpsRanges);
                    return mediaCapabilities;
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "", "<init>", "()V", "", "getValue", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "PhotosTab", "AlbumsTab"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class DefaultTab {
            public abstract int getValue();

            private DefaultTab() {
            }

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class PhotosTab extends androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab {
                public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab();
                private static final int value = 1;

                private PhotosTab() {
                    super(null);
                }

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                public final int getValue() {
                    return value;
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab$AlbumsTab;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class AlbumsTab extends androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab {
                public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.AlbumsTab INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.AlbumsTab();
                private static final int value = 0;

                private AlbumsTab() {
                    super(null);
                }

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                public final int getValue() {
                    return value;
                }
            }

            public /* synthetic */ DefaultTab(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, androidx.view.result.PickVisualMediaRequest input) {
            androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilitiesForTranscoding;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion companion = INSTANCE;
            if (companion.isSystemPickerAvailable$activity()) {
                android.content.Intent intent = new android.content.Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity(input.getMediaType()));
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().getValue());
                if (input.getIsCustomAccentColorApplied()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
                }
                if (android.os.Build.VERSION.SDK_INT >= 33 && (mediaCapabilitiesForTranscoding = input.getMediaCapabilitiesForTranscoding()) != null) {
                    intent.putExtra("android.provider.extra.MEDIA_CAPABILITIES", mediaCapabilitiesForTranscoding.toApplicationMediaCapabilities$activity());
                }
                return intent;
            }
            if (companion.isSystemFallbackPickerAvailable$activity(context)) {
                android.content.pm.ResolveInfo systemFallbackPicker$activity = companion.getSystemFallbackPicker$activity(context);
                if (systemFallbackPicker$activity == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                android.content.pm.ActivityInfo activityInfo = systemFallbackPicker$activity.activityInfo;
                android.content.Intent intent2 = new android.content.Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(companion.getVisualMimeType$activity(input.getMediaType()));
                intent2.putExtra(EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB, input.getDefaultTab().getValue());
                if (input.getIsCustomAccentColorApplied()) {
                    intent2.putExtra(EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR, input.getAccentColor());
                }
                return intent2;
            }
            android.content.Intent intent3 = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(companion.getVisualMimeType$activity(input.getMediaType()));
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED});
            }
            return intent3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int resultCode, android.content.Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            android.net.Uri data = intent.getData();
            return data == null ? (android.net.Uri) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.INSTANCE.getClipDataUris$activity(intent)) : data;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context context, androidx.view.result.PickVisualMediaRequest input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isPhotoPickerAvailable(android.content.Context context) {
            return INSTANCE.isPhotoPickerAvailable(context);
        }

        @kotlin.Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @kotlin.jvm.JvmStatic
        public static final boolean isPhotoPickerAvailable() {
            return INSTANCE.isPhotoPickerAvailable();
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u001a2\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0011\u001a\u0015\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "maxItems", "<init>", "(I)V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class PickMultipleVisualMedia extends androidx.view.result.contract.ActivityResultContract<androidx.view.result.PickVisualMediaRequest, java.util.List<android.net.Uri>> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion INSTANCE = new androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes;

        public PickMultipleVisualMedia(int i) {
            this.getHighSpeedVideoSizes = i;
            if (i <= 1) {
                throw new java.lang.IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }

        public /* synthetic */ PickMultipleVisualMedia(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? INSTANCE.getMaxItems$activity() : i);
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, androidx.view.result.PickVisualMediaRequest input) {
            androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilitiesForTranscoding;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            if (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.INSTANCE.isSystemPickerAvailable$activity()) {
                android.content.Intent intent = new android.content.Intent("android.provider.action.PICK_IMAGES");
                intent.setType(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.INSTANCE.getVisualMimeType$activity(input.getMediaType()));
                int min = java.lang.Math.min(this.getHighSpeedVideoSizes, input.getMaxItems());
                if (min <= 1 || min > android.provider.MediaStore.getPickImagesMaxLimit()) {
                    throw new java.lang.IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()".toString());
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().getValue());
                intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", input.getIsOrderedSelection());
                if (input.getIsCustomAccentColorApplied()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
                }
                if (android.os.Build.VERSION.SDK_INT >= 33 && (mediaCapabilitiesForTranscoding = input.getMediaCapabilitiesForTranscoding()) != null) {
                    intent.putExtra("android.provider.extra.MEDIA_CAPABILITIES", mediaCapabilitiesForTranscoding.toApplicationMediaCapabilities$activity());
                }
                return intent;
            }
            if (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.INSTANCE.isSystemFallbackPickerAvailable$activity(context)) {
                android.content.pm.ResolveInfo systemFallbackPicker$activity = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.INSTANCE.getSystemFallbackPicker$activity(context);
                if (systemFallbackPicker$activity == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                android.content.pm.ActivityInfo activityInfo = systemFallbackPicker$activity.activityInfo;
                android.content.Intent intent2 = new android.content.Intent(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.INSTANCE.getVisualMimeType$activity(input.getMediaType()));
                int min2 = java.lang.Math.min(this.getHighSpeedVideoSizes, input.getMaxItems());
                if (min2 <= 1) {
                    throw new java.lang.IllegalArgumentException("Max items must be greater than 1".toString());
                }
                intent2.putExtra(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX, min2);
                intent2.putExtra(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB, input.getDefaultTab().getValue());
                intent2.putExtra(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER, input.getIsOrderedSelection());
                if (input.getIsCustomAccentColorApplied()) {
                    intent2.putExtra(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR, input.getAccentColor());
                }
                return intent2;
            }
            android.content.Intent intent3 = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.INSTANCE.getVisualMimeType$activity(input.getMediaType()));
            intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED});
            }
            return intent3;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final java.util.List<android.net.Uri> parseResult(int resultCode, android.content.Intent intent) {
            java.util.List<android.net.Uri> clipDataUris$activity;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.INSTANCE.getClipDataUris$activity(intent)) == null) ? kotlin.collections.CollectionsKt.emptyList() : clipDataUris$activity;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;", "", "<init>", "()V", "", "getMaxItems$activity", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final int getMaxItems$activity() {
                if (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.INSTANCE.isSystemPickerAvailable$activity()) {
                    return android.provider.MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context context, androidx.view.result.PickVisualMediaRequest input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            return null;
        }

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }
    }
}
