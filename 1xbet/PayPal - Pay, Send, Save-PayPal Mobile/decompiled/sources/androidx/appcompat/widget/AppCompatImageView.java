package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class AppCompatImageView extends android.widget.ImageView implements androidx.core.view.TintableBackgroundView, androidx.core.widget.TintableImageSourceView {
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private boolean mHasLevel;
    private final androidx.appcompat.widget.AppCompatImageHelper mImageHelper;

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatImageView> {
        private int Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.Camera2StreamConfigurationMap = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.backgroundTint);
            this.getHighSpeedVideoSizes = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.backgroundTintMode);
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapObject("tint", androidx.appcompat.R.attr.tint);
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapObject("tintMode", androidx.appcompat.R.attr.tintMode);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.AppCompatImageView appCompatImageView, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.Camera2StreamConfigurationMap, appCompatImageView.getBackgroundTintList());
            propertyReader.readObject(this.getHighSpeedVideoSizes, appCompatImageView.getBackgroundTintMode());
            propertyReader.readObject(this.getHighSpeedVideoFpsRangesFor, appCompatImageView.getImageTintList());
            propertyReader.readObject(this.getHighSpeedVideoFpsRanges, appCompatImageView.getImageTintMode());
        }
    }

    public AppCompatImageView(android.content.Context context) {
        this(context, null);
    }

    public AppCompatImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(androidx.appcompat.widget.TintContextWrapper.wrap(context), attributeSet, i);
        this.mHasLevel = false;
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = new androidx.appcompat.widget.AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI(attributeSet, i);
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = new androidx.appcompat.widget.AppCompatImageHelper(this);
        this.mImageHelper = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.setImageResource(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null && drawable != null && !this.mHasLevel) {
            appCompatImageHelper.getHighSpeedVideoFpsRangesFor(drawable);
        }
        super.setImageDrawable(drawable);
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper2 = this.mImageHelper;
        if (appCompatImageHelper2 != null) {
            appCompatImageHelper2.getHighResolutionOutputSizeshNQ4ISI();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.getHighSpeedVideoSizes();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Camera2StreamConfigurationMap(drawable);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.Camera2StreamConfigurationMap();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoSizes(mode);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.getHighSpeedVideoFpsRangesFor(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public android.content.res.ColorStateList getSupportImageTintList() {
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.getHighSpeedVideoFpsRanges();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.getHighSpeedVideoFpsRanges(mode);
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.getHighSpeedVideoFpsRangesFor();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.getHighSpeedVideoFpsRanges();
        }
        androidx.appcompat.widget.AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.Camera2StreamConfigurationMap() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }
}
