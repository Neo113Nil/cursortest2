package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcoil3/decode/ImageSource;", "Lcoil3/request/Options;", "options", "", "animated", "Landroid/graphics/ImageDecoder$Source;", "toImageDecoderSourceOrNull", "(Lcoil3/decode/ImageSource;Lcoil3/request/Options;Z)Landroid/graphics/ImageDecoder$Source;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StaticImageDecoderKt {
    public static /* synthetic */ android.content.res.AssetFileDescriptor $r8$lambda$ecTZ4OC966AyL1NSlt6Vf361UZo(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }

    public static final android.graphics.ImageDecoder.Source toImageDecoderSourceOrNull(coil3.graphics.ImageSource imageSource, coil3.view.Options options, boolean z) {
        okio.Path fileOrNull;
        if (imageSource.getFileSystem() == okio.FileSystem.SYSTEM && (fileOrNull = imageSource.fileOrNull()) != null) {
            return android.graphics.ImageDecoder.createSource(fileOrNull.toFile());
        }
        coil3.decode.ImageSource.Metadata metadata = imageSource.getMetadata();
        if (metadata instanceof coil3.graphics.AssetMetadata) {
            return android.graphics.ImageDecoder.createSource(options.getContext().getAssets(), ((coil3.graphics.AssetMetadata) metadata).getFilePath());
        }
        if ((metadata instanceof coil3.graphics.ContentMetadata) && android.os.Build.VERSION.SDK_INT >= 29) {
            try {
                final android.content.res.AssetFileDescriptor assetFileDescriptor = ((coil3.graphics.ContentMetadata) metadata).getAssetFileDescriptor();
                android.system.Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), android.system.OsConstants.SEEK_SET);
                return android.graphics.ImageDecoder.createSource((java.util.concurrent.Callable<android.content.res.AssetFileDescriptor>) new java.util.concurrent.Callable() { // from class: coil3.decode.StaticImageDecoderKt$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return coil3.graphics.StaticImageDecoderKt.$r8$lambda$ecTZ4OC966AyL1NSlt6Vf361UZo(assetFileDescriptor);
                    }
                });
            } catch (android.system.ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof coil3.graphics.ResourceMetadata) {
            coil3.graphics.ResourceMetadata resourceMetadata = (coil3.graphics.ResourceMetadata) metadata;
            if (kotlin.jvm.internal.Intrinsics.areEqual(resourceMetadata.getPackageName(), options.getContext().getPackageName())) {
                return android.graphics.ImageDecoder.createSource(options.getContext().getResources(), resourceMetadata.getResId());
            }
        }
        if (!(metadata instanceof coil3.graphics.ByteBufferMetadata)) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 || !z || ((coil3.graphics.ByteBufferMetadata) metadata).getByteBuffer().isDirect()) {
            return android.graphics.ImageDecoder.createSource(((coil3.graphics.ByteBufferMetadata) metadata).getByteBuffer());
        }
        return null;
    }
}
