package com.squareup.picasso;

/* loaded from: classes5.dex */
public interface Callback {

    public static class EmptyCallback implements com.squareup.picasso.Callback {
        @Override // com.squareup.picasso.Callback
        public void onError(java.lang.Exception exc) {
        }

        @Override // com.squareup.picasso.Callback
        public void onSuccess() {
        }
    }

    void onError(java.lang.Exception exc);

    void onSuccess();
}
