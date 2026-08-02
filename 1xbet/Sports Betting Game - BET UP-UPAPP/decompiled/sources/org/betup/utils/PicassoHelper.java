package org.betup.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;
import java.util.ArrayList;
import java.util.List;
import jp.wasabeef.picasso.transformations.BlurTransformation;
import jp.wasabeef.picasso.transformations.gpu.BrightnessFilterTransformation;
import org.betup.R;

/* loaded from: classes4.dex */
public final class PicassoHelper {
    private Context context;
    private int errorPlaceholder;
    private boolean fit;
    private String imageUrl;
    private ImageView imageView;
    private int placeholderId;
    private final List<Transformation> transformations = new ArrayList();

    public static PicassoHelper with(Context context) {
        PicassoHelper picassoHelper = new PicassoHelper();
        picassoHelper.context = context;
        return picassoHelper;
    }

    public PicassoHelper setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public PicassoHelper setImageView(ImageView imageView) {
        this.imageView = imageView;
        return this;
    }

    public PicassoHelper withBlur() {
        this.transformations.add(new BlurTransformation(this.context, 10, 4));
        this.transformations.add(new BrightnessFilterTransformation(this.context, -0.5f));
        return this;
    }

    public PicassoHelper fit() {
        this.fit = true;
        return this;
    }

    public PicassoHelper errorPlaceholder(int errorPlaceholder) {
        this.errorPlaceholder = errorPlaceholder;
        return this;
    }

    public PicassoHelper placeholder(int placeholderId) {
        this.placeholderId = placeholderId;
        return this;
    }

    public PicassoHelper load() {
        if (!TextUtils.isEmpty(this.imageUrl)) {
            RequestCreator load = Picasso.get().load(this.imageUrl);
            int i = this.placeholderId;
            if (i != 0) {
                load.placeholder(i);
            }
            int i2 = this.errorPlaceholder;
            if (i2 != 0) {
                load.error(i2);
            } else {
                load.error(R.mipmap.ic_launcher);
            }
            if (this.transformations.size() > 0) {
                load.fit();
                load.centerCrop();
                load.transform(this.transformations);
            } else if (this.fit) {
                load.fit();
            }
            ImageView imageView = this.imageView;
            if (imageView != null) {
                load.into(imageView);
            }
        } else {
            int i3 = this.placeholderId;
            if (i3 != 0) {
                this.imageView.setImageResource(i3);
            }
        }
        return this;
    }

    public PicassoHelper load(Callback callback) {
        if (!TextUtils.isEmpty(this.imageUrl)) {
            RequestCreator load = Picasso.get().load(this.imageUrl);
            int i = this.placeholderId;
            if (i != 0) {
                load.placeholder(i);
            }
            int i2 = this.errorPlaceholder;
            if (i2 != 0) {
                load.error(i2);
            } else {
                load.error(R.mipmap.ic_launcher);
            }
            if (this.transformations.size() > 0) {
                load.fit();
                load.centerCrop();
                load.transform(this.transformations);
            } else if (this.fit) {
                load.fit();
            }
            ImageView imageView = this.imageView;
            if (imageView != null) {
                load.into(imageView, callback);
            }
        } else {
            int i3 = this.placeholderId;
            if (i3 != 0) {
                this.imageView.setImageResource(i3);
            }
            if (callback != null) {
                callback.onError(new IllegalArgumentException("Image URL is empty"));
            }
        }
        return this;
    }
}
