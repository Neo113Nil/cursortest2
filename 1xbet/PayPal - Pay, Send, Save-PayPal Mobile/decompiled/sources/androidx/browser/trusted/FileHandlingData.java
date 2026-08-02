package androidx.browser.trusted;

/* loaded from: classes6.dex */
public final class FileHandlingData {
    public static final java.lang.String KEY_URIS = "androidx.browser.trusted.KEY_URIS";
    public final java.util.List<android.net.Uri> uris;

    public FileHandlingData(java.util.List<android.net.Uri> list) {
        this.uris = (java.util.List) java.util.Objects.requireNonNull(list);
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.uris != null) {
            bundle.putParcelableArrayList(KEY_URIS, new java.util.ArrayList<>(this.uris));
        }
        return bundle;
    }

    public static androidx.browser.trusted.FileHandlingData fromBundle(android.os.Bundle bundle) {
        return new androidx.browser.trusted.FileHandlingData(androidx.core.os.BundleCompat.getParcelableArrayList(bundle, KEY_URIS, android.net.Uri.class));
    }
}
