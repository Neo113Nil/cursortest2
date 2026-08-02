package com.google.mlkit.vision.common.internal;

/* loaded from: classes9.dex */
public class AutoMLModelUtils {
    public static java.lang.String[] getModelAndLabelFilePaths(android.content.Context context, com.google.mlkit.common.model.LocalModel localModel, boolean z) throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2 = z ? (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(localModel.getAssetFilePath()) : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(localModel.getAbsoluteFilePath());
        if (localModel.isManifestFile()) {
            com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile = com.google.mlkit.common.internal.model.ModelUtils.parseManifestFile(str2, z, context);
            if (parseManifestFile == null) {
                throw new java.io.IOException("Failed to parse manifest file.");
            }
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE.equals(parseManifestFile.getModelType()), "Model type should be: %s.", com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE);
            str2 = new java.io.File(new java.io.File(str2).getParent(), parseManifestFile.getModelFile()).toString();
            str = new java.io.File(new java.io.File(str2).getParent(), parseManifestFile.getLabelsFile()).toString();
        } else {
            str = "";
        }
        return new java.lang.String[]{str2, str};
    }

    public static java.util.List<java.lang.String> readLabelsFile(android.content.Context context, java.lang.String str, boolean z) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.InputStream open = z ? context.getAssets().open(str) : new java.io.FileInputStream(new java.io.File(str));
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, "UTF-8"));
            for (java.lang.String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                arrayList.add(readLine);
            }
            if (open != null) {
                open.close();
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (java.lang.Throwable th2) {
                    try {
                        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            throw th;
        }
    }

    private AutoMLModelUtils() {
    }
}
