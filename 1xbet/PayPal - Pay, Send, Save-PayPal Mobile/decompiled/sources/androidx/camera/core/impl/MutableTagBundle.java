package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class MutableTagBundle extends androidx.camera.core.impl.TagBundle {
    private MutableTagBundle(java.util.Map<java.lang.String, java.lang.Object> map) {
        super(map);
    }

    public static androidx.camera.core.impl.MutableTagBundle create() {
        return new androidx.camera.core.impl.MutableTagBundle(new android.util.ArrayMap());
    }

    public static androidx.camera.core.impl.MutableTagBundle from(androidx.camera.core.impl.TagBundle tagBundle) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        for (java.lang.String str : tagBundle.listKeys()) {
            arrayMap.put(str, tagBundle.getTag(str));
        }
        return new androidx.camera.core.impl.MutableTagBundle(arrayMap);
    }

    public void putTag(java.lang.String str, java.lang.Object obj) {
        this.mTagMap.put(str, obj);
    }

    public void addTagBundle(androidx.camera.core.impl.TagBundle tagBundle) {
        if (this.mTagMap == null || tagBundle.mTagMap == null) {
            return;
        }
        this.mTagMap.putAll(tagBundle.mTagMap);
    }
}
