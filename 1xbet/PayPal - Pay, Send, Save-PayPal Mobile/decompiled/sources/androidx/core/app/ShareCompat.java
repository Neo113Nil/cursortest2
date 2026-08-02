package androidx.core.app;

/* loaded from: classes7.dex */
public final class ShareCompat {
    public static final java.lang.String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final java.lang.String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final java.lang.String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final java.lang.String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    private ShareCompat() {
    }

    public static java.lang.String getCallingPackage(android.app.Activity activity) {
        android.content.Intent intent = activity.getIntent();
        java.lang.String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : Camera2StreamConfigurationMap(intent);
    }

    static java.lang.String Camera2StreamConfigurationMap(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(EXTRA_CALLING_PACKAGE);
        return stringExtra == null ? intent.getStringExtra(EXTRA_CALLING_PACKAGE_INTEROP) : stringExtra;
    }

    public static android.content.ComponentName getCallingActivity(android.app.Activity activity) {
        android.content.Intent intent = activity.getIntent();
        android.content.ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? getHighResolutionOutputSizeshNQ4ISI(intent) : callingActivity;
    }

    static android.content.ComponentName getHighResolutionOutputSizeshNQ4ISI(android.content.Intent intent) {
        android.content.ComponentName componentName = (android.content.ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY);
        return componentName == null ? (android.content.ComponentName) intent.getParcelableExtra(EXTRA_CALLING_ACTIVITY_INTEROP) : componentName;
    }

    @java.lang.Deprecated
    public static void configureMenuItem(android.view.MenuItem menuItem, androidx.core.app.ShareCompat.IntentBuilder intentBuilder) {
        android.widget.ShareActionProvider shareActionProvider;
        android.view.ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof android.widget.ShareActionProvider)) {
            shareActionProvider = new android.widget.ShareActionProvider(intentBuilder.getHighSpeedVideoFpsRangesFor());
        } else {
            shareActionProvider = (android.widget.ShareActionProvider) actionProvider;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".sharecompat_");
        sb.append(intentBuilder.getHighSpeedVideoFpsRangesFor().getClass().getName());
        shareActionProvider.setShareHistoryFileName(sb.toString());
        shareActionProvider.setShareIntent(intentBuilder.getIntent());
        menuItem.setActionProvider(shareActionProvider);
    }

    @java.lang.Deprecated
    public static void configureMenuItem(android.view.Menu menu, int i, androidx.core.app.ShareCompat.IntentBuilder intentBuilder) {
        android.view.MenuItem findItem = menu.findItem(i);
        if (findItem == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not find menu item with id ");
            sb.append(i);
            sb.append(" in the supplied menu");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        configureMenuItem(findItem, intentBuilder);
    }

    public static class IntentBuilder {
        private java.lang.CharSequence Camera2StreamConfigurationMap;
        private java.util.ArrayList<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        private java.util.ArrayList<java.lang.String> getHighSpeedVideoFpsRanges;
        private final android.content.Intent getHighSpeedVideoFpsRangesFor;
        private final android.content.Context getHighSpeedVideoSizes;
        private java.util.ArrayList<android.net.Uri> getHighSpeedVideoSizesFor;
        private java.util.ArrayList<java.lang.String> getInputFormats;
        private android.content.IntentSender getInputSizeshNQ4ISI;

        @java.lang.Deprecated
        public static androidx.core.app.ShareCompat.IntentBuilder from(android.app.Activity activity) {
            return new androidx.core.app.ShareCompat.IntentBuilder(activity);
        }

        public IntentBuilder(android.content.Context context) {
            android.app.Activity activity;
            this.getHighSpeedVideoSizes = (android.content.Context) androidx.core.util.Preconditions.checkNotNull(context);
            android.content.Intent action = new android.content.Intent().setAction("android.intent.action.SEND");
            this.getHighSpeedVideoFpsRangesFor = action;
            action.putExtra(androidx.core.app.ShareCompat.EXTRA_CALLING_PACKAGE, context.getPackageName());
            action.putExtra(androidx.core.app.ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof android.app.Activity) {
                        activity = (android.app.Activity) context;
                        break;
                    }
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                android.content.ComponentName componentName = activity.getComponentName();
                this.getHighSpeedVideoFpsRangesFor.putExtra(androidx.core.app.ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
                this.getHighSpeedVideoFpsRangesFor.putExtra(androidx.core.app.ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
            }
        }

        public android.content.Intent getIntent() {
            java.util.ArrayList<java.lang.String> arrayList = this.getInputFormats;
            if (arrayList != null) {
                getHighSpeedVideoSizes("android.intent.extra.EMAIL", arrayList);
                this.getInputFormats = null;
            }
            java.util.ArrayList<java.lang.String> arrayList2 = this.getHighSpeedVideoFpsRanges;
            if (arrayList2 != null) {
                getHighSpeedVideoSizes("android.intent.extra.CC", arrayList2);
                this.getHighSpeedVideoFpsRanges = null;
            }
            java.util.ArrayList<java.lang.String> arrayList3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (arrayList3 != null) {
                getHighSpeedVideoSizes("android.intent.extra.BCC", arrayList3);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
            java.util.ArrayList<android.net.Uri> arrayList4 = this.getHighSpeedVideoSizesFor;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.getHighSpeedVideoFpsRangesFor.setAction("android.intent.action.SEND");
                java.util.ArrayList<android.net.Uri> arrayList5 = this.getHighSpeedVideoSizesFor;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    this.getHighSpeedVideoFpsRangesFor.putExtra("android.intent.extra.STREAM", this.getHighSpeedVideoSizesFor.get(0));
                    androidx.core.app.ShareCompat.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor);
                } else {
                    this.getHighSpeedVideoFpsRangesFor.removeExtra("android.intent.extra.STREAM");
                    this.getHighSpeedVideoFpsRangesFor.setClipData(null);
                    android.content.Intent intent = this.getHighSpeedVideoFpsRangesFor;
                    intent.setFlags(intent.getFlags() & (-2));
                }
            } else {
                this.getHighSpeedVideoFpsRangesFor.setAction("android.intent.action.SEND_MULTIPLE");
                this.getHighSpeedVideoFpsRangesFor.putParcelableArrayListExtra("android.intent.extra.STREAM", this.getHighSpeedVideoSizesFor);
                androidx.core.app.ShareCompat.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor);
            }
            return this.getHighSpeedVideoFpsRangesFor;
        }

        android.content.Context getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizes;
        }

        private void getHighSpeedVideoSizes(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
            java.lang.String[] stringArrayExtra = this.getHighSpeedVideoFpsRangesFor.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            java.lang.String[] strArr = new java.lang.String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                java.lang.System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.getHighSpeedVideoFpsRangesFor.putExtra(str, strArr);
        }

        private void getHighSpeedVideoSizes(java.lang.String str, java.lang.String[] strArr) {
            android.content.Intent intent = getIntent();
            java.lang.String[] stringArrayExtra = intent.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            java.lang.String[] strArr2 = new java.lang.String[strArr.length + length];
            if (stringArrayExtra != null) {
                java.lang.System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            java.lang.System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intent.putExtra(str, strArr2);
        }

        public android.content.Intent createChooserIntent() {
            return android.content.Intent.createChooser(getIntent(), this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI);
        }

        public void startChooser() {
            this.getHighSpeedVideoSizes.startActivity(createChooserIntent());
        }

        public androidx.core.app.ShareCompat.IntentBuilder setChooserTitle(java.lang.CharSequence charSequence) {
            this.Camera2StreamConfigurationMap = charSequence;
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setChooserTitle(int i) {
            return setChooserTitle(this.getHighSpeedVideoSizes.getText(i));
        }

        public androidx.core.app.ShareCompat.IntentBuilder setIntentSender(android.content.IntentSender intentSender) {
            this.getInputSizeshNQ4ISI = intentSender;
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setType(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.setType(str);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setText(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoFpsRangesFor.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setHtmlText(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.putExtra(androidx.core.content.IntentCompat.EXTRA_HTML_TEXT, str);
            if (!this.getHighSpeedVideoFpsRangesFor.hasExtra("android.intent.extra.TEXT")) {
                setText(android.text.Html.fromHtml(str));
            }
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setStream(android.net.Uri uri) {
            this.getHighSpeedVideoSizesFor = null;
            if (uri != null) {
                addStream(uri);
            }
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addStream(android.net.Uri uri) {
            if (this.getHighSpeedVideoSizesFor == null) {
                this.getHighSpeedVideoSizesFor = new java.util.ArrayList<>();
            }
            this.getHighSpeedVideoSizesFor.add(uri);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailTo(java.lang.String[] strArr) {
            if (this.getInputFormats != null) {
                this.getInputFormats = null;
            }
            this.getHighSpeedVideoFpsRangesFor.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailTo(java.lang.String str) {
            if (this.getInputFormats == null) {
                this.getInputFormats = new java.util.ArrayList<>();
            }
            this.getInputFormats.add(str);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailTo(java.lang.String[] strArr) {
            getHighSpeedVideoSizes("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailCc(java.lang.String[] strArr) {
            this.getHighSpeedVideoFpsRangesFor.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailCc(java.lang.String str) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
            }
            this.getHighSpeedVideoFpsRanges.add(str);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailCc(java.lang.String[] strArr) {
            getHighSpeedVideoSizes("android.intent.extra.CC", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setEmailBcc(java.lang.String[] strArr) {
            this.getHighSpeedVideoFpsRangesFor.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailBcc(java.lang.String str) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.add(str);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder addEmailBcc(java.lang.String[] strArr) {
            getHighSpeedVideoSizes("android.intent.extra.BCC", strArr);
            return this;
        }

        public androidx.core.app.ShareCompat.IntentBuilder setSubject(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }
    }

    public static class IntentReader {
        private final android.content.ComponentName Camera2StreamConfigurationMap;
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private java.util.ArrayList<android.net.Uri> getHighSpeedVideoFpsRanges;
        private final android.content.Intent getHighSpeedVideoFpsRangesFor;
        private final android.content.Context getHighSpeedVideoSizes;

        @java.lang.Deprecated
        public static androidx.core.app.ShareCompat.IntentReader from(android.app.Activity activity) {
            return new androidx.core.app.ShareCompat.IntentReader(activity);
        }

        public IntentReader(android.app.Activity activity) {
            this((android.content.Context) androidx.core.util.Preconditions.checkNotNull(activity), activity.getIntent());
        }

        public IntentReader(android.content.Context context, android.content.Intent intent) {
            this.getHighSpeedVideoSizes = (android.content.Context) androidx.core.util.Preconditions.checkNotNull(context);
            this.getHighSpeedVideoFpsRangesFor = (android.content.Intent) androidx.core.util.Preconditions.checkNotNull(intent);
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.app.ShareCompat.Camera2StreamConfigurationMap(intent);
            this.Camera2StreamConfigurationMap = androidx.core.app.ShareCompat.getHighResolutionOutputSizeshNQ4ISI(intent);
        }

        public boolean isShareIntent() {
            java.lang.String action = this.getHighSpeedVideoFpsRangesFor.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.getHighSpeedVideoFpsRangesFor.getAction());
        }

        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.getHighSpeedVideoFpsRangesFor.getAction());
        }

        public java.lang.String getType() {
            return this.getHighSpeedVideoFpsRangesFor.getType();
        }

        public java.lang.CharSequence getText() {
            return this.getHighSpeedVideoFpsRangesFor.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public java.lang.String getHtmlText() {
            java.lang.String stringExtra = this.getHighSpeedVideoFpsRangesFor.getStringExtra(androidx.core.content.IntentCompat.EXTRA_HTML_TEXT);
            if (stringExtra != null) {
                return stringExtra;
            }
            java.lang.CharSequence text = getText();
            if (text instanceof android.text.Spanned) {
                return android.text.Html.toHtml((android.text.Spanned) text);
            }
            return text != null ? android.text.Html.escapeHtml(text) : stringExtra;
        }

        public android.net.Uri getStream() {
            return (android.net.Uri) this.getHighSpeedVideoFpsRangesFor.getParcelableExtra("android.intent.extra.STREAM");
        }

        public android.net.Uri getStream(int i) {
            if (this.getHighSpeedVideoFpsRanges == null && isMultipleShare()) {
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            java.util.ArrayList<android.net.Uri> arrayList = this.getHighSpeedVideoFpsRanges;
            if (arrayList != null) {
                return arrayList.get(i);
            }
            if (i == 0) {
                return (android.net.Uri) this.getHighSpeedVideoFpsRangesFor.getParcelableExtra("android.intent.extra.STREAM");
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Stream items available: ");
            sb.append(getStreamCount());
            sb.append(" index requested: ");
            sb.append(i);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }

        public int getStreamCount() {
            if (this.getHighSpeedVideoFpsRanges == null && isMultipleShare()) {
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            java.util.ArrayList<android.net.Uri> arrayList = this.getHighSpeedVideoFpsRanges;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.getHighSpeedVideoFpsRangesFor.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        public java.lang.String[] getEmailTo() {
            return this.getHighSpeedVideoFpsRangesFor.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public java.lang.String[] getEmailCc() {
            return this.getHighSpeedVideoFpsRangesFor.getStringArrayExtra("android.intent.extra.CC");
        }

        public java.lang.String[] getEmailBcc() {
            return this.getHighSpeedVideoFpsRangesFor.getStringArrayExtra("android.intent.extra.BCC");
        }

        public java.lang.String getSubject() {
            return this.getHighSpeedVideoFpsRangesFor.getStringExtra("android.intent.extra.SUBJECT");
        }

        public java.lang.String getCallingPackage() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public android.content.ComponentName getCallingActivity() {
            return this.Camera2StreamConfigurationMap;
        }

        public android.graphics.drawable.Drawable getCallingActivityIcon() {
            if (this.Camera2StreamConfigurationMap == null) {
                return null;
            }
            try {
                return this.getHighSpeedVideoSizes.getPackageManager().getActivityIcon(this.Camera2StreamConfigurationMap);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public android.graphics.drawable.Drawable getCallingApplicationIcon() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                return null;
            }
            try {
                return this.getHighSpeedVideoSizes.getPackageManager().getApplicationIcon(this.getHighResolutionOutputSizeshNQ4ISI);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public java.lang.CharSequence getCallingApplicationLabel() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                return null;
            }
            android.content.pm.PackageManager packageManager = this.getHighSpeedVideoSizes.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.getHighResolutionOutputSizeshNQ4ISI, 0));
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    static void getHighSpeedVideoSizes(android.content.Intent intent, java.util.ArrayList<android.net.Uri> arrayList) {
        android.content.ClipData clipData = new android.content.ClipData(null, new java.lang.String[]{intent.getType()}, new android.content.ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(androidx.core.content.IntentCompat.EXTRA_HTML_TEXT), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new android.content.ClipData.Item(arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
