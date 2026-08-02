package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class ResourcesWrapper extends android.content.res.Resources {
    private final android.content.res.Resources getHighSpeedVideoSizes;

    public ResourcesWrapper(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.getHighSpeedVideoSizes = resources;
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getText(i);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getString(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i, java.lang.Object... objArr) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i, int i2, java.lang.Object... objArr) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i, java.lang.CharSequence charSequence) {
        return this.getHighSpeedVideoSizes.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.getHighSpeedVideoSizes.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getDrawable(i);
    }

    final android.graphics.drawable.Drawable Camera2StreamConfigurationMap(int i) throws android.content.res.Resources.NotFoundException {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        return androidx.core.content.res.ResourcesCompat.getDrawable(this.getHighSpeedVideoSizes, i, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i, int i2) throws android.content.res.Resources.NotFoundException {
        return androidx.core.content.res.ResourcesCompat.getDrawableForDensity(this.getHighSpeedVideoSizes, i, i2, null);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i, int i2, android.content.res.Resources.Theme theme) {
        return androidx.core.content.res.ResourcesCompat.getDrawableForDensity(this.getHighSpeedVideoSizes, i, i2, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.Movie getMovie(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getMovie(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getColor(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getInteger(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getLayout(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getAnimation(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getXml(i);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i, android.util.TypedValue typedValue) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public android.content.res.AssetFileDescriptor openRawResourceFd(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        this.getHighSpeedVideoSizes.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        this.getHighSpeedVideoSizes.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z) throws android.content.res.Resources.NotFoundException {
        this.getHighSpeedVideoSizes.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return this.getHighSpeedVideoSizes.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        android.content.res.Resources resources = this.getHighSpeedVideoSizes;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        return this.getHighSpeedVideoSizes.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        return this.getHighSpeedVideoSizes.getConfiguration();
    }

    @Override // android.content.res.Resources
    public int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.getHighSpeedVideoSizes.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceName(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourcePackageName(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceTypeName(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceEntryName(int i) throws android.content.res.Resources.NotFoundException {
        return this.getHighSpeedVideoSizes.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        this.getHighSpeedVideoSizes.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException {
        this.getHighSpeedVideoSizes.parseBundleExtra(str, attributeSet, bundle);
    }
}
