package org.betup.ui.fragment.settings;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.content.FileProvider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.sentry.instrumentation.file.SentryFileOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes4.dex */
public class PhotoProcessor {
    public static int SAMPLE_SIZE = 340;
    private Context context;
    private String mCurrentPhotoPath;

    public PhotoProcessor(Context context) {
        this.context = context;
        Log.d("PHOTOTEST", "SIZE OF PHOTO SET TO " + SAMPLE_SIZE);
        SAMPLE_SIZE = (int) FirebaseRemoteConfig.getInstance().getLong("avatarUploadSize");
    }

    private File createImageFile() throws IOException {
        File createTempFile = File.createTempFile("JPEG_profile", ".jpg", this.context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        this.mCurrentPhotoPath = createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private Bitmap makeSquare(Bitmap srcBmp) {
        if (srcBmp == null) {
            return null;
        }
        if (srcBmp.getWidth() >= srcBmp.getHeight()) {
            return Bitmap.createBitmap(srcBmp, (srcBmp.getWidth() / 2) - (srcBmp.getHeight() / 2), 0, srcBmp.getHeight(), srcBmp.getHeight());
        }
        return Bitmap.createBitmap(srcBmp, 0, (srcBmp.getHeight() / 2) - (srcBmp.getWidth() / 2), srcBmp.getWidth(), srcBmp.getWidth());
    }

    public String getCurrentPhotoPath() {
        return this.mCurrentPhotoPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getCompressedImagePath(String path) {
        FileOutputStream fileOutputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        int i = options.outWidth < options.outHeight ? options.outWidth : options.outHeight;
        int i2 = SAMPLE_SIZE;
        if (i > i2) {
            options.inSampleSize = i / i2;
        }
        options.inJustDecodeBounds = false;
        Bitmap makeSquare = makeSquare(BitmapFactory.decodeFile(path, options));
        SentryFileOutputStream sentryFileOutputStream = 0;
        if (makeSquare == null) {
            return null;
        }
        Log.d("PHOTOTEST", "PHOTO W = " + makeSquare.getWidth() + "  H = " + makeSquare.getHeight());
        try {
            try {
                File file = new File(this.context.getFilesDir(), "profile.png");
                fileOutputStream = new FileOutputStream(file);
                try {
                    makeSquare.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    String absolutePath = file.getAbsolutePath();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return absolutePath;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                sentryFileOutputStream = "PHOTOTEST";
                if (sentryFileOutputStream != 0) {
                    try {
                        sentryFileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (sentryFileOutputStream != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getCompressedImagePath(Bitmap bitmap) {
        int i;
        FileOutputStream fileOutputStream;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height && height > (i2 = SAMPLE_SIZE)) {
            width = (width * i2) / height;
            height = i2;
        } else if (width < height && width > (i = SAMPLE_SIZE)) {
            height = (height * i) / width;
            width = i;
        }
        Bitmap makeSquare = makeSquare(Bitmap.createScaledBitmap(bitmap, width, height, false));
        SentryFileOutputStream sentryFileOutputStream = 0;
        if (makeSquare == null) {
            return null;
        }
        Log.d("PHOTOTEST", "PHOTO W = " + makeSquare.getWidth() + "  H = " + makeSquare.getHeight());
        try {
            try {
                File file = new File(this.context.getFilesDir(), "profile.png");
                fileOutputStream = new FileOutputStream(file);
                try {
                    makeSquare.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    String absolutePath = file.getAbsolutePath();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return absolutePath;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                sentryFileOutputStream = "PHOTOTEST";
                if (sentryFileOutputStream != 0) {
                    try {
                        sentryFileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (sentryFileOutputStream != 0) {
            }
            throw th;
        }
    }

    public static MultipartBody.Part encodeBitmapFile(Context context, String path, String fieldName) {
        if (path == null) {
            return null;
        }
        File file = new File(path);
        Bitmap decodeFile = BitmapFactory.decodeFile(path, new BitmapFactory.Options());
        Log.d("PHOTOTEST", "HAVING AVATAR " + decodeFile.getWidth() + " " + decodeFile.getHeight());
        return MultipartBody.Part.createFormData(fieldName, file.getName(), RequestBody.create(MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART), file));
    }

    public Intent getCameraIntent() {
        File file;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.context.getPackageManager()) != null) {
            try {
                file = createImageFile();
            } catch (IOException unused) {
                file = null;
            }
            if (file != null) {
                intent.putExtra("output", FileProvider.getUriForFile(this.context, this.context.getPackageName() + ".fileprovider", file));
                return intent;
            }
        }
        return null;
    }
}
