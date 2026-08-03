package com.squareup.picasso;

/* loaded from: classes5.dex */
public interface Cache {
    public static final com.squareup.picasso.Cache NONE = new com.squareup.picasso.Cache() { // from class: com.squareup.picasso.Cache.1
        @Override // com.squareup.picasso.Cache
        public void clear() {
        }

        @Override // com.squareup.picasso.Cache
        public void clearKeyUri(java.lang.String str) {
        }

        @Override // com.squareup.picasso.Cache
        public android.graphics.Bitmap get(java.lang.String str) {
            return null;
        }

        @Override // com.squareup.picasso.Cache
        public int maxSize() {
            return 0;
        }

        @Override // com.squareup.picasso.Cache
        public void set(java.lang.String str, android.graphics.Bitmap bitmap) {
        }

        @Override // com.squareup.picasso.Cache
        public int size() {
            return 0;
        }
    };

    void clear();

    void clearKeyUri(java.lang.String str);

    android.graphics.Bitmap get(java.lang.String str);

    int maxSize();

    void set(java.lang.String str, android.graphics.Bitmap bitmap);

    int size();
}
