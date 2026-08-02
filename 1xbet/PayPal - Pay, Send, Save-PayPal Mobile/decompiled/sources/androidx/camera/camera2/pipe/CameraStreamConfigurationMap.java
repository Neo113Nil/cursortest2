package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\n\u0010\u0005J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u000b\u001a\u00020\u0003H&¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0003H&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H&¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0012\u0010\u0019J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u000b\u001a\u00020\u0003H&¢\u0006\u0004\b\u001c\u0010\bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H&¢\u0006\u0004\b\u001d\u0010\u0005J#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00022\u0006\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0002H&¢\u0006\u0004\b#\u0010\u0005J#\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001fH&¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u000b\u001a\u00020\u0003H&¢\u0006\u0004\b'\u0010\bJ\u001f\u0010,\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b*\u0010+J+\u0010,\u001a\u00020)\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b.\u0010+J+\u0010/\u001a\u00020)\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b/\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraStreamConfigurationMap;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "", "Landroidx/camera/camera2/pipe/StreamFormat;", "getOutputFormats", "()Ljava/util/List;", "inputFormat", "getValidOutputFormatsForInput-hNQ4ISI", "(I)Ljava/util/List;", "getValidOutputFormatsForInput", "getInputFormats", "format", "Landroid/util/Size;", "getInputSizes-hNQ4ISI", "getInputSizes", "", "isOutputSupportedFor-hNQ4ISI", "(I)Z", "isOutputSupportedFor", "T", "Ljava/lang/Class;", "klass", "(Ljava/lang/Class;)Z", "Landroid/view/Surface;", "surface", "(Landroid/view/Surface;)Z", "getOutputSizes", "(Ljava/lang/Class;)Ljava/util/List;", "getOutputSizes-hNQ4ISI", "getHighSpeedVideoSizes", io.ktor.http.ContentDisposition.Parameters.Size, "Landroid/util/Range;", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/util/Size;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "fpsRange", "getHighSpeedVideoSizesFor", "(Landroid/util/Range;)Ljava/util/List;", "getHighResolutionOutputSizes-hNQ4ISI", "getHighResolutionOutputSizes", "", "getOutputMinFrameDuration-lomOqCM", "(ILandroid/util/Size;)J", "getOutputMinFrameDuration", "(Ljava/lang/Class;Landroid/util/Size;)J", "getOutputStallDuration-lomOqCM", "getOutputStallDuration"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraStreamConfigurationMap extends androidx.camera.camera2.pipe.UnsafeWrapper {
    /* renamed from: getHighResolutionOutputSizes-hNQ4ISI */
    java.util.List<android.util.Size> mo0getHighResolutionOutputSizeshNQ4ISI(int format);

    java.util.List<android.util.Range<java.lang.Integer>> getHighSpeedVideoFpsRanges();

    java.util.List<android.util.Range<java.lang.Integer>> getHighSpeedVideoFpsRangesFor(android.util.Size size);

    java.util.List<android.util.Size> getHighSpeedVideoSizes();

    java.util.List<android.util.Size> getHighSpeedVideoSizesFor(android.util.Range<java.lang.Integer> fpsRange);

    java.util.List<androidx.camera.camera2.pipe.StreamFormat> getInputFormats();

    /* renamed from: getInputSizes-hNQ4ISI */
    java.util.List<android.util.Size> mo1getInputSizeshNQ4ISI(int format);

    java.util.List<androidx.camera.camera2.pipe.StreamFormat> getOutputFormats();

    <T> long getOutputMinFrameDuration(java.lang.Class<T> klass, android.util.Size size);

    /* renamed from: getOutputMinFrameDuration-lomOqCM */
    long mo2getOutputMinFrameDurationlomOqCM(int format, android.util.Size size);

    <T> java.util.List<android.util.Size> getOutputSizes(java.lang.Class<T> klass);

    /* renamed from: getOutputSizes-hNQ4ISI */
    java.util.List<android.util.Size> mo3getOutputSizeshNQ4ISI(int format);

    <T> long getOutputStallDuration(java.lang.Class<T> klass, android.util.Size size);

    /* renamed from: getOutputStallDuration-lomOqCM */
    long mo4getOutputStallDurationlomOqCM(int format, android.util.Size size);

    /* renamed from: getValidOutputFormatsForInput-hNQ4ISI */
    java.util.List<androidx.camera.camera2.pipe.StreamFormat> mo5getValidOutputFormatsForInputhNQ4ISI(int inputFormat);

    boolean isOutputSupportedFor(android.view.Surface surface);

    <T> boolean isOutputSupportedFor(java.lang.Class<T> klass);

    /* renamed from: isOutputSupportedFor-hNQ4ISI */
    boolean mo6isOutputSupportedForhNQ4ISI(int format);
}
