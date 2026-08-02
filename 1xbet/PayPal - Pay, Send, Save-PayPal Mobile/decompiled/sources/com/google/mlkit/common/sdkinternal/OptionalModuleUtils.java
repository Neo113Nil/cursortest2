package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class OptionalModuleUtils {
    public static final java.lang.String BARCODE = "barcode";
    public static final java.lang.String BARCODE_MODULE_ID = "com.google.android.gms.vision.barcode";
    public static final java.lang.String CUSTOM_ICA = "custom_ica";
    public static final java.lang.String CUSTOM_ICA_MODULE_ID = "com.google.android.gms.vision.custom.ica";
    public static final java.lang.String DEPRECATED_DYNAMITE_MODULE_ID = "com.google.android.gms.vision.dynamite";
    public static final java.lang.String DOCSCAN_CROP_MODULE_ID = "com.google.android.gms.mlkit_docscan_crop";
    public static final java.lang.String DOCSCAN_DETECT_MODULE_ID = "com.google.android.gms.mlkit_docscan_detect";
    public static final java.lang.String DOCSCAN_ENHANCE_MODULE_ID = "com.google.android.gms.mlkit_docscan_enhance";
    public static final java.lang.String DOCSCAN_SHADOW_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_shadow";
    public static final java.lang.String DOCSCAN_STAIN_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_stain";
    public static final com.google.android.gms.common.Feature[] EMPTY_FEATURES = new com.google.android.gms.common.Feature[0];
    public static final java.lang.String FACE = "face";
    public static final java.lang.String FACE_MODULE_ID = "com.google.android.gms.vision.face";
    public static final com.google.android.gms.common.Feature FEATURE_BARCODE;
    public static final com.google.android.gms.common.Feature FEATURE_CUSTOM_ICA;
    public static final com.google.android.gms.common.Feature FEATURE_DOCSCAN_CROP;
    public static final com.google.android.gms.common.Feature FEATURE_DOCSCAN_DETECT;
    public static final com.google.android.gms.common.Feature FEATURE_DOCSCAN_ENHANCE;
    public static final com.google.android.gms.common.Feature FEATURE_DOCSCAN_SHADOW_REMOVAL;
    public static final com.google.android.gms.common.Feature FEATURE_DOCSCAN_STAIN_REMOVAL;
    public static final com.google.android.gms.common.Feature FEATURE_DOCSCAN_UI;
    public static final com.google.android.gms.common.Feature FEATURE_FACE;
    public static final com.google.android.gms.common.Feature FEATURE_ICA;
    public static final com.google.android.gms.common.Feature FEATURE_IMAGE_CAPTION;
    public static final com.google.android.gms.common.Feature FEATURE_IMAGE_QUALITY_AESTHETIC;
    public static final com.google.android.gms.common.Feature FEATURE_IMAGE_QUALITY_TECHNICAL;
    public static final com.google.android.gms.common.Feature FEATURE_LANGID;
    public static final com.google.android.gms.common.Feature FEATURE_MLKIT_BARCODE_UI;
    public static final com.google.android.gms.common.Feature FEATURE_NLCLASSIFIER;
    public static final com.google.android.gms.common.Feature FEATURE_OCR;
    public static final com.google.android.gms.common.Feature FEATURE_OCR_CHINESE;
    public static final com.google.android.gms.common.Feature FEATURE_OCR_COMMON;
    public static final com.google.android.gms.common.Feature FEATURE_OCR_DEVANAGARI;
    public static final com.google.android.gms.common.Feature FEATURE_OCR_JAPANESE;
    public static final com.google.android.gms.common.Feature FEATURE_OCR_KOREAN;
    public static final com.google.android.gms.common.Feature FEATURE_SMART_REPLY;
    public static final com.google.android.gms.common.Feature FEATURE_SUBJECT_SEGMENTATION;
    public static final com.google.android.gms.common.Feature FEATURE_TFLITE_DYNAMITE;
    public static final java.lang.String ICA = "ica";
    public static final java.lang.String ICA_MODULE_ID = "com.google.android.gms.vision.ica";
    public static final java.lang.String IMAGE_CAPTION_MODULE_ID = "com.google.android.gms.mlkit_image_caption";
    public static final java.lang.String IMAGE_QUALITY_AESTHETIC_MODULE_ID = "com.google.android.gms.mlkit_quality_aesthetic";
    public static final java.lang.String IMAGE_QUALITY_TECHNICAL_MODULE_ID = "com.google.android.gms.mlkit_quality_technical";
    public static final java.lang.String LANGID = "langid";
    public static final java.lang.String LANGID_MODULE_ID = "com.google.android.gms.mlkit.langid";
    public static final java.lang.String MLKIT_BARCODE_UI = "barcode_ui";
    public static final java.lang.String NLCLASSIFIER = "nlclassifier";
    public static final java.lang.String NLCLASSIFIER_MODULE_ID = "com.google.android.gms.mlkit.nlclassifier";
    public static final java.lang.String OCR = "ocr";
    public static final java.lang.String OCR_CHINESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_chinese";
    public static final java.lang.String OCR_COMMON_MODULE_ID = "com.google.android.gms.mlkit_ocr_common";
    public static final java.lang.String OCR_DEVANAGARI_MODULE_ID = "com.google.android.gms.mlkit_ocr_devanagari";
    public static final java.lang.String OCR_JAPANESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_japanese";
    public static final java.lang.String OCR_KOREAN_MODULE_ID = "com.google.android.gms.mlkit_ocr_korean";
    public static final java.lang.String OCR_MODULE_ID = "com.google.android.gms.vision.ocr";
    public static final java.lang.String SMART_REPLY = "smart_reply";
    public static final java.lang.String SMART_REPLY_MODULE_ID = "com.google.android.gms.mlkit_smartreply";
    public static final java.lang.String SUBJECT_SEGMENTATION_MODULE_ID = "com.google.android.gms.mlkit_subject_segmentation";
    public static final java.lang.String TFLITE_DYNAMITE = "tflite_dynamite";
    public static final java.lang.String TFLITE_DYNAMITE_MODULE_ID = "com.google.android.gms.tflite_dynamite";
    private static final com.google.android.gms.internal.mlkit_common.zzai zza;
    private static final com.google.android.gms.internal.mlkit_common.zzai zzb;

    static {
        com.google.android.gms.common.Feature feature = new com.google.android.gms.common.Feature("vision.barcode", 1L);
        FEATURE_BARCODE = feature;
        com.google.android.gms.common.Feature feature2 = new com.google.android.gms.common.Feature("vision.custom.ica", 1L);
        FEATURE_CUSTOM_ICA = feature2;
        com.google.android.gms.common.Feature feature3 = new com.google.android.gms.common.Feature("vision.face", 1L);
        FEATURE_FACE = feature3;
        com.google.android.gms.common.Feature feature4 = new com.google.android.gms.common.Feature("vision.ica", 1L);
        FEATURE_ICA = feature4;
        com.google.android.gms.common.Feature feature5 = new com.google.android.gms.common.Feature("vision.ocr", 1L);
        FEATURE_OCR = feature5;
        FEATURE_OCR_CHINESE = new com.google.android.gms.common.Feature("mlkit.ocr.chinese", 1L);
        FEATURE_OCR_COMMON = new com.google.android.gms.common.Feature("mlkit.ocr.common", 1L);
        FEATURE_OCR_DEVANAGARI = new com.google.android.gms.common.Feature("mlkit.ocr.devanagari", 1L);
        FEATURE_OCR_JAPANESE = new com.google.android.gms.common.Feature("mlkit.ocr.japanese", 1L);
        FEATURE_OCR_KOREAN = new com.google.android.gms.common.Feature("mlkit.ocr.korean", 1L);
        com.google.android.gms.common.Feature feature6 = new com.google.android.gms.common.Feature("mlkit.langid", 1L);
        FEATURE_LANGID = feature6;
        com.google.android.gms.common.Feature feature7 = new com.google.android.gms.common.Feature("mlkit.nlclassifier", 1L);
        FEATURE_NLCLASSIFIER = feature7;
        com.google.android.gms.common.Feature feature8 = new com.google.android.gms.common.Feature(TFLITE_DYNAMITE, 1L);
        FEATURE_TFLITE_DYNAMITE = feature8;
        com.google.android.gms.common.Feature feature9 = new com.google.android.gms.common.Feature("mlkit.barcode.ui", 1L);
        FEATURE_MLKIT_BARCODE_UI = feature9;
        com.google.android.gms.common.Feature feature10 = new com.google.android.gms.common.Feature("mlkit.smartreply", 1L);
        FEATURE_SMART_REPLY = feature10;
        FEATURE_IMAGE_CAPTION = new com.google.android.gms.common.Feature("mlkit.image.caption", 1L);
        FEATURE_DOCSCAN_DETECT = new com.google.android.gms.common.Feature("mlkit.docscan.detect", 1L);
        FEATURE_DOCSCAN_CROP = new com.google.android.gms.common.Feature("mlkit.docscan.crop", 1L);
        FEATURE_DOCSCAN_ENHANCE = new com.google.android.gms.common.Feature("mlkit.docscan.enhance", 1L);
        FEATURE_DOCSCAN_UI = new com.google.android.gms.common.Feature("mlkit.docscan.ui", 1L);
        FEATURE_DOCSCAN_STAIN_REMOVAL = new com.google.android.gms.common.Feature("mlkit.docscan.stain", 1L);
        FEATURE_DOCSCAN_SHADOW_REMOVAL = new com.google.android.gms.common.Feature("mlkit.docscan.shadow", 1L);
        FEATURE_IMAGE_QUALITY_AESTHETIC = new com.google.android.gms.common.Feature("mlkit.quality.aesthetic", 1L);
        FEATURE_IMAGE_QUALITY_TECHNICAL = new com.google.android.gms.common.Feature("mlkit.quality.technical", 1L);
        FEATURE_SUBJECT_SEGMENTATION = new com.google.android.gms.common.Feature("mlkit.segmentation.subject", 1L);
        com.google.android.gms.internal.mlkit_common.zzah zzahVar = new com.google.android.gms.internal.mlkit_common.zzah();
        zzahVar.zza(BARCODE, feature);
        zzahVar.zza(CUSTOM_ICA, feature2);
        zzahVar.zza("face", feature3);
        zzahVar.zza(ICA, feature4);
        zzahVar.zza(OCR, feature5);
        zzahVar.zza(LANGID, feature6);
        zzahVar.zza(NLCLASSIFIER, feature7);
        zzahVar.zza(TFLITE_DYNAMITE, feature8);
        zzahVar.zza(MLKIT_BARCODE_UI, feature9);
        zzahVar.zza(SMART_REPLY, feature10);
        zza = zzahVar.zzb();
        com.google.android.gms.internal.mlkit_common.zzah zzahVar2 = new com.google.android.gms.internal.mlkit_common.zzah();
        zzahVar2.zza(BARCODE_MODULE_ID, feature);
        zzahVar2.zza(CUSTOM_ICA_MODULE_ID, feature2);
        zzahVar2.zza(FACE_MODULE_ID, feature3);
        zzahVar2.zza(ICA_MODULE_ID, feature4);
        zzahVar2.zza(OCR_MODULE_ID, feature5);
        zzahVar2.zza(LANGID_MODULE_ID, feature6);
        zzahVar2.zza(NLCLASSIFIER_MODULE_ID, feature7);
        zzahVar2.zza(TFLITE_DYNAMITE_MODULE_ID, feature8);
        zzahVar2.zza(SMART_REPLY_MODULE_ID, feature10);
        zzb = zzahVar2.zzb();
    }

    @java.lang.Deprecated
    public static boolean areAllRequiredModulesAvailable(android.content.Context context, java.util.List<java.lang.String> list) {
        if (com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            return areAllRequiredModulesAvailable(context, zza(zzb, list));
        }
        try {
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, it.next());
            }
            return true;
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    @java.lang.Deprecated
    public static void requestDownload(android.content.Context context, java.lang.String str) {
        requestDownload(context, com.google.android.gms.internal.mlkit_common.zzaf.zzh(str));
    }

    private static com.google.android.gms.common.Feature[] zza(java.util.Map map, java.util.List list) {
        com.google.android.gms.common.Feature[] featureArr = new com.google.android.gms.common.Feature[list.size()];
        for (int i = 0; i < list.size(); i++) {
            featureArr[i] = (com.google.android.gms.common.Feature) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.Feature) map.get(list.get(i)));
        }
        return featureArr;
    }

    @java.lang.Deprecated
    public static void requestDownload(android.content.Context context, java.util.List<java.lang.String> list) {
        if (com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            requestDownload(context, zza(zza, list));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", android.text.TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static boolean areAllRequiredModulesAvailable(android.content.Context context, final com.google.android.gms.common.Feature[] featureArr) {
        try {
            return ((com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse) com.google.android.gms.tasks.Tasks.await(com.google.android.gms.common.moduleinstall.ModuleInstall.getClient(context).areModulesAvailable(new com.google.android.gms.common.api.OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.zzq
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final com.google.android.gms.common.Feature[] getOptionalFeatures() {
                    com.google.android.gms.common.Feature[] featureArr2 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.EMPTY_FEATURES;
                    return featureArr;
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.zzr
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                }
            }))).areModulesAvailable();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return false;
        }
    }

    public static void requestDownload(android.content.Context context, final com.google.android.gms.common.Feature[] featureArr) {
        com.google.android.gms.common.moduleinstall.ModuleInstall.getClient(context).installModules(com.google.android.gms.common.moduleinstall.ModuleInstallRequest.newBuilder().addApi(new com.google.android.gms.common.api.OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.zzo
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final com.google.android.gms.common.Feature[] getOptionalFeatures() {
                com.google.android.gms.common.Feature[] featureArr2 = com.google.mlkit.common.sdkinternal.OptionalModuleUtils.EMPTY_FEATURES;
                return featureArr;
            }
        }).build()).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.zzp
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
            }
        });
    }

    private OptionalModuleUtils() {
    }
}
