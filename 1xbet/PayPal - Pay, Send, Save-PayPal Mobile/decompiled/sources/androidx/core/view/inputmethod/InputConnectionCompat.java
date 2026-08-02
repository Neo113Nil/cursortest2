package androidx.core.view.inputmethod;

/* loaded from: classes3.dex */
public final class InputConnectionCompat {
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    public interface OnCommitContentListener {
        boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, int i, android.os.Bundle bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, android.os.Bundle bundle, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener onCommitContentListener) {
        boolean z;
        java.lang.String str2;
        android.os.ResultReceiver resultReceiver;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (android.text.TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else {
            if (!android.text.TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z = true;
        }
        if (z) {
            str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        } else {
            str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        try {
            resultReceiver = (android.os.ResultReceiver) bundle.getParcelable(str2);
            if (z) {
                str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            } else {
                str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            try {
                android.net.Uri uri = (android.net.Uri) bundle.getParcelable(str3);
                if (z) {
                    str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                } else {
                    str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                android.content.ClipDescription clipDescription = (android.content.ClipDescription) bundle.getParcelable(str4);
                if (z) {
                    str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                } else {
                    str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                android.net.Uri uri2 = (android.net.Uri) bundle.getParcelable(str5);
                if (z) {
                    str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                } else {
                    str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                int i = bundle.getInt(str6);
                if (z) {
                    str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                } else {
                    str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                android.os.Bundle bundle2 = (android.os.Bundle) bundle.getParcelable(str7);
                if (uri != null && clipDescription != null) {
                    r0 = onCommitContentListener.onCommitContent(new androidx.core.view.inputmethod.InputContentInfoCompat(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r0, null);
                }
                return r0;
            } catch (java.lang.Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    public static boolean commitContent(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, int i, android.os.Bundle bundle) {
        return androidx.core.view.inputmethod.InputConnectionCompat.Api25Impl.getHighSpeedVideoFpsRanges(inputConnection, (android.view.inputmethod.InputContentInfo) inputContentInfoCompat.unwrap(), i, bundle);
    }

    @java.lang.Deprecated
    public static android.view.inputmethod.InputConnection createWrapper(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, final androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener onCommitContentListener) {
        androidx.core.util.ObjectsCompat.requireNonNull(inputConnection, "inputConnection must be non-null");
        androidx.core.util.ObjectsCompat.requireNonNull(editorInfo, "editorInfo must be non-null");
        androidx.core.util.ObjectsCompat.requireNonNull(onCommitContentListener, "onCommitContentListener must be non-null");
        return new android.view.inputmethod.InputConnectionWrapper(inputConnection, false) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
                if (onCommitContentListener.onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat.wrap(inputContentInfo), i, bundle)) {
                    return true;
                }
                return super.commitContent(inputContentInfo, i, bundle);
            }
        };
    }

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$2, reason: invalid class name */
    class AnonymousClass2 extends android.view.inputmethod.InputConnectionWrapper {
        final /* synthetic */ androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener getHighSpeedVideoFpsRanges;

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
            if (androidx.core.view.inputmethod.InputConnectionCompat.getHighSpeedVideoFpsRangesFor(str, bundle, this.getHighSpeedVideoFpsRanges)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public static android.view.inputmethod.InputConnection createWrapper(android.view.View view, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        return createWrapper(inputConnection, editorInfo, getHighResolutionOutputSizeshNQ4ISI(view));
    }

    private static androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener getHighResolutionOutputSizeshNQ4ISI(final android.view.View view) {
        androidx.core.util.Preconditions.checkNotNull(view);
        return new androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener() { // from class: androidx.core.view.inputmethod.InputConnectionCompat$$ExternalSyntheticLambda0
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, int i, android.os.Bundle bundle) {
                return androidx.core.view.inputmethod.InputConnectionCompat.getHighSpeedVideoFpsRangesFor(view, inputContentInfoCompat, i, bundle);
            }
        };
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(android.view.View view, androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, int i, android.os.Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                android.os.Parcelable parcelable = (android.os.Parcelable) inputContentInfoCompat.unwrap();
                bundle = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        return androidx.core.view.ViewCompat.performReceiveContent(view, new androidx.core.view.ContentInfoCompat.Builder(new android.content.ClipData(inputContentInfoCompat.getDescription(), new android.content.ClipData.Item(inputContentInfoCompat.getContentUri())), 2).setLinkUri(inputContentInfoCompat.getLinkUri()).setExtras(bundle).build()) == null;
    }

    @java.lang.Deprecated
    public InputConnectionCompat() {
    }

    /* loaded from: classes7.dex */
    static class Api25Impl {
        private Api25Impl() {
        }

        static boolean getHighSpeedVideoFpsRanges(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }
}
