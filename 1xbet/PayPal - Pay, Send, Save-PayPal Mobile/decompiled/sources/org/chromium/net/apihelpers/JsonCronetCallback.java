package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public abstract class JsonCronetCallback extends org.chromium.net.apihelpers.InMemoryTransformCronetCallback<org.json.JSONObject> {
    private static final org.chromium.net.apihelpers.StringCronetCallback getHighSpeedVideoSizes = new org.chromium.net.apihelpers.StringCronetCallback() { // from class: org.chromium.net.apihelpers.JsonCronetCallback.1
        @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
        protected boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public org.chromium.net.apihelpers.JsonCronetCallback addCompletionListener(org.chromium.net.apihelpers.CronetRequestCompletionListener<? super org.json.JSONObject> cronetRequestCompletionListener) {
        super.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public org.json.JSONObject transformBodyBytes(org.chromium.net.UrlResponseInfo urlResponseInfo, byte[] bArr) {
        try {
            return new org.json.JSONObject(getHighSpeedVideoSizes.transformBodyBytes(urlResponseInfo, bArr));
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalArgumentException("Cannot parse the string as JSON!", e);
        }
    }
}
