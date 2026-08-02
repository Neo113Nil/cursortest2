package Z50;

import H30.C3133b;
import H30.l;
import T80.c;
import U50.j;
import U50.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64OutputStream;
import android.webkit.WebView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.D;
import com.squareup.moshi.Moshi;
import e40.C6293a;
import g30.InterfaceC6618a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemDTO;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.CameraTakeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.CameraTipsOptions;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.VideoOptions;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.settings.models.FeatureValue;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class d extends V50.a<TakePhotoRequest> implements n<C6293a> {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final List<String> f35591n = C7714v.b0("TRY_TO_GO_TO", "RETURN_VALUE", "PHOTO");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f35592b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f35593c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M f35594d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<String> f35595e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Q90.c f35596f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f35597g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f35598h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final g f35599i;

    /* renamed from: j, reason: collision with root package name */
    private j f35600j;

    /* renamed from: k, reason: collision with root package name */
    private String f35601k;

    /* renamed from: l, reason: collision with root package name */
    private String f35602l;

    /* renamed from: m, reason: collision with root package name */
    private String f35603m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, @NotNull S80.b fintechNavigation, @NotNull M coroutineScope, @NotNull Function0<String> uniqueUuidProvider, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull g encryptManager, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(uniqueUuidProvider, "uniqueUuidProvider");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(encryptManager, "encryptManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f35592b = context;
        this.f35593c = fintechNavigation;
        this.f35594d = coroutineScope;
        this.f35595e = uniqueUuidProvider;
        this.f35596f = featureToggles;
        this.f35597g = fintechSettings;
        this.f35598h = fintechAnalyticInteractor;
        this.f35599i = encryptManager;
    }

    public static void e(d dVar, WeakReference weakReference) {
        WebView webView;
        FintechWebView fintechWebView = (FintechWebView) weakReference.get();
        if (fintechWebView != null && (webView = fintechWebView.getWebView()) != null) {
            webView.getUrl();
        }
        dVar.getClass();
    }

    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [U50.j, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static final void f(d dVar, C6293a c6293a) {
        ?? r102;
        String str;
        Exception exc;
        CameraTakeResult cameraTakeResult;
        j jVar = dVar.f35600j;
        if (jVar != null) {
            File d11 = c6293a.d();
            String h11 = c6293a.h();
            String g10 = c6293a.g();
            String f7 = c6293a.f();
            boolean b11 = c6293a.b();
            List<String> c11 = c6293a.c();
            String a11 = c6293a.a();
            String str2 = "";
            if (!b11) {
                InterfaceC6618a interfaceC6618a = dVar.f35598h;
                if (d11 != null) {
                    String str3 = dVar.f35601k;
                    if (str3 != null) {
                        try {
                            cameraTakeResult = dVar.h(d11, str3, h11);
                            exc = null;
                        } catch (Exception e11) {
                            exc = e11;
                            cameraTakeResult = null;
                        }
                        if (cameraTakeResult != null) {
                            try {
                                str2 = dVar.c().c(CameraTakeResult.class).toJson(cameraTakeResult);
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                            jVar.invoke(new NativeResult.Success(str2));
                            interfaceC6618a.Z1(null, false);
                        } else {
                            interfaceC6618a.Z1(exc, true);
                            jVar.invoke(new NativeResult.Error("Ошибка при подготовке фото к отправке..", null, 2, null));
                        }
                    }
                } else {
                    if (g10 != null || f7 != null) {
                        try {
                            str2 = dVar.c().c(CameraTakeResult.class).toJson(new CameraTakeResult("", "", g10, f7, null, null, null, null, 240, null));
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                        jVar.invoke(new NativeResult.Success(str2));
                        interfaceC6618a.f1(dVar.f35602l, true);
                        r102 = 0;
                        dVar.f35601k = r102;
                        dVar.f35600j = r102;
                        dVar.f35602l = r102;
                    }
                    if (c11 != null) {
                        try {
                            str2 = dVar.c().c(CameraTakeResult.class).toJson(new CameraTakeResult("", "", null, null, c11, null, null, null, 236, null));
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                        jVar.invoke(new NativeResult.Success(str2));
                        interfaceC6618a.f1(dVar.f35602l, true);
                    } else if (a11 != null) {
                        if (Tl.a.f(dVar.f35596f, S90.c.MOB_BANK_CARD_ENCRYPT) && (str = dVar.f35603m) != null) {
                            a11 = dVar.f35599i.a(str, a11);
                        }
                        try {
                            str2 = dVar.c().c(CameraTakeResult.class).toJson(new CameraTakeResult("", "", null, null, null, a11, null, null, 220, null));
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                        jVar.invoke(new NativeResult.Success(str2));
                        interfaceC6618a.f1(dVar.f35602l, true);
                    } else {
                        interfaceC6618a.Z1(null, true);
                        jVar.invoke(new NativeResult.Error("Ошибка при подготовке фото к отправке..", null, 2, null));
                        if (C7714v.A(C7714v.b0(TakePhotoRequest.QR_SCANNER_TYPE, "TEXT", TakePhotoRequest.BANK_CARD, "QR_AND_BARCODE", TakePhotoRequest.BARCODE_SCANNER_TYPE), dVar.f35602l)) {
                            interfaceC6618a.f1(dVar.f35602l, false);
                        }
                    }
                }
            } else if (c6293a.e()) {
                try {
                    str2 = dVar.c().c(CameraTakeResult.class).toJson(new CameraTakeResult("", "", null, null, null, null, null, Boolean.TRUE, 124, null));
                } catch (Throwable th6) {
                    th6.printStackTrace();
                }
                jVar.invoke(new NativeResult.Success(str2));
            } else {
                jVar.invoke(new NativeResult.Error("Пользователь закрыл камеру", NativeResult.Error.a.USER_CANCELLED));
            }
            r102 = 0;
            dVar.f35601k = r102;
            dVar.f35600j = r102;
            dVar.f35602l = r102;
        }
    }

    private static void g(androidx.exifinterface.media.a aVar, androidx.exifinterface.media.a aVar2) {
        for (String str : C7714v.b0("DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance")) {
            String d11 = aVar.d(str);
            if (d11 != null) {
                aVar2.H(str, d11);
            }
        }
    }

    @Override // U50.n
    public final void a(C6293a c6293a) {
        C6293a result = c6293a;
        Intrinsics.checkNotNullParameter(result, "result");
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(this.f35594d, He.b.f10879b, null, new c(this, result, null), 2);
    }

    @Override // V50.a
    @NotNull
    public final Class<TakePhotoRequest> b() {
        return TakePhotoRequest.class;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        if (r1.equals(ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest.BANK_CARD) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
    
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f0, code lost:
    
        if (r1.equals(ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest.BARCODE_SCANNER_TYPE) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f9, code lost:
    
        if (r1.equals("TEXT") == false) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00db. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    @Override // V50.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(WeakReference weakReference, Object obj, j callback) {
        String str;
        String str2;
        String str3;
        FintechWebView fintechWebView;
        TakePhotoRequest value = (TakePhotoRequest) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f35600j = callback;
        if (weakReference != null && (fintechWebView = (FintechWebView) weakReference.get()) != null) {
            fintechWebView.post(new JL.a(3, this, weakReference));
        }
        this.f35601k = value.getCertificate();
        this.f35603m = value.getPublicKey();
        boolean F11 = this.f35597g.F();
        Function0<String> function0 = this.f35595e;
        if (F11) {
            String confirmTitle = value.getConfirmTitle();
            String invoke = function0.invoke();
            boolean isBack = value.isBack();
            String previewCameraTitle = value.getPreviewCameraTitle();
            CameraTipsOptions tipsOptions = value.getTipsOptions();
            String json = tipsOptions != null ? c().d(D.e(List.class, TextItemDTO.class)).toJson(tipsOptions.getTextAtoms()) : null;
            CameraTipsOptions tipsOptions2 = value.getTipsOptions();
            c.a.a(this.f35593c, "PASSPORT", confirmTitle, "PHOTO", false, invoke, false, isBack, previewCameraTitle, json, tipsOptions2 != null ? tipsOptions2.getType() : null, value.getPhoneNumberRegex(), value.getBarcodeFormats(), null, true, 5000L, "FHD", value.getRoundFaceFrameEnabled(), 4128);
            return;
        }
        Boolean isNeedFrame = value.isNeedFrame();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.d(isNeedFrame, bool)) {
            str = "PASSPORT";
        } else {
            if (Intrinsics.d(value.isNeedQrFrame(), bool)) {
                String upperCase = value.getScannerType().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                switch (upperCase.hashCode()) {
                    case 76348:
                        if (upperCase.equals(TakePhotoRequest.MIX_SCANNER_TYPE)) {
                            str = "QR_AND_BARCODE";
                            break;
                        }
                        str = TakePhotoRequest.QR_SCANNER_TYPE;
                        break;
                    case 2571565:
                        str2 = "TEXT";
                        break;
                    case 384398432:
                        str2 = TakePhotoRequest.BARCODE_SCANNER_TYPE;
                        break;
                    case 1028436787:
                        str2 = TakePhotoRequest.BANK_CARD;
                        break;
                    default:
                        str = TakePhotoRequest.QR_SCANNER_TYPE;
                        break;
                }
                this.f35602l = r12;
                String confirmTitle2 = value.getConfirmTitle();
                if (value.getQrAction().length() > 0) {
                    String qrAction = value.getQrAction();
                    Locale locale = Locale.ROOT;
                    String upperCase2 = qrAction.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    if (f35591n.contains(upperCase2)) {
                        str3 = value.getQrAction().toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(str3, "toUpperCase(...)");
                        String str4 = str3;
                        Boolean qrADetectAutoClose = value.getQrADetectAutoClose();
                        boolean booleanValue = qrADetectAutoClose != null ? qrADetectAutoClose.booleanValue() : true;
                        String invoke2 = function0.invoke();
                        boolean isBack2 = value.isBack();
                        String previewCameraTitle2 = value.getPreviewCameraTitle();
                        CameraTipsOptions tipsOptions3 = value.getTipsOptions();
                        String json2 = tipsOptions3 != null ? c().d(D.e(List.class, TextItemDTO.class)).toJson(tipsOptions3.getTextAtoms()) : null;
                        CameraTipsOptions tipsOptions4 = value.getTipsOptions();
                        String type = tipsOptions4 != null ? tipsOptions4.getType() : null;
                        String phoneNumberRegex = value.getPhoneNumberRegex();
                        List<String> barcodeFormats = value.getBarcodeFormats();
                        String qrButtonText = value.getQrButtonText();
                        VideoOptions videoOptions = value.getVideoOptions();
                        boolean z11 = videoOptions == null && videoOptions.getEnabled();
                        VideoOptions videoOptions2 = value.getVideoOptions();
                        Long valueOf = videoOptions2 != null ? Long.valueOf(videoOptions2.getChunkDurationMs()) : null;
                        VideoOptions videoOptions3 = value.getVideoOptions();
                        c.a.a(this.f35593c, r12, confirmTitle2, str4, booleanValue, invoke2, false, isBack2, previewCameraTitle2, json2, type, phoneNumberRegex, barcodeFormats, qrButtonText, z11, valueOf, videoOptions3 != null ? videoOptions3.getVideoQuality() : null, value.getRoundFaceFrameEnabled(), 32);
                    }
                }
                str3 = "TRY_TO_GO_TO";
                String str42 = str3;
                Boolean qrADetectAutoClose2 = value.getQrADetectAutoClose();
                if (qrADetectAutoClose2 != null) {
                }
                String invoke22 = function0.invoke();
                boolean isBack22 = value.isBack();
                String previewCameraTitle22 = value.getPreviewCameraTitle();
                CameraTipsOptions tipsOptions32 = value.getTipsOptions();
                if (tipsOptions32 != null) {
                }
                CameraTipsOptions tipsOptions42 = value.getTipsOptions();
                if (tipsOptions42 != null) {
                }
                String phoneNumberRegex2 = value.getPhoneNumberRegex();
                List<String> barcodeFormats2 = value.getBarcodeFormats();
                String qrButtonText2 = value.getQrButtonText();
                VideoOptions videoOptions4 = value.getVideoOptions();
                if (videoOptions4 == null) {
                }
                VideoOptions videoOptions22 = value.getVideoOptions();
                if (videoOptions22 != null) {
                }
                VideoOptions videoOptions32 = value.getVideoOptions();
                c.a.a(this.f35593c, r12, confirmTitle2, str42, booleanValue, invoke22, false, isBack22, previewCameraTitle22, json2, type, phoneNumberRegex2, barcodeFormats2, qrButtonText2, z11, valueOf, videoOptions32 != null ? videoOptions32.getVideoQuality() : null, value.getRoundFaceFrameEnabled(), 32);
            }
            str = value.isRegFrame() ? "REGISTRATION" : "NONE";
        }
        String str5 = str;
        this.f35602l = str5;
        String confirmTitle22 = value.getConfirmTitle();
        if (value.getQrAction().length() > 0) {
        }
        str3 = "TRY_TO_GO_TO";
        String str422 = str3;
        Boolean qrADetectAutoClose22 = value.getQrADetectAutoClose();
        if (qrADetectAutoClose22 != null) {
        }
        String invoke222 = function0.invoke();
        boolean isBack222 = value.isBack();
        String previewCameraTitle222 = value.getPreviewCameraTitle();
        CameraTipsOptions tipsOptions322 = value.getTipsOptions();
        if (tipsOptions322 != null) {
        }
        CameraTipsOptions tipsOptions422 = value.getTipsOptions();
        if (tipsOptions422 != null) {
        }
        String phoneNumberRegex22 = value.getPhoneNumberRegex();
        List<String> barcodeFormats22 = value.getBarcodeFormats();
        String qrButtonText22 = value.getQrButtonText();
        VideoOptions videoOptions42 = value.getVideoOptions();
        if (videoOptions42 == null) {
        }
        VideoOptions videoOptions222 = value.getVideoOptions();
        if (videoOptions222 != null) {
        }
        VideoOptions videoOptions322 = value.getVideoOptions();
        c.a.a(this.f35593c, str5, confirmTitle22, str422, booleanValue, invoke222, false, isBack222, previewCameraTitle222, json2, type, phoneNumberRegex22, barcodeFormats22, qrButtonText22, z11, valueOf, videoOptions322 != null ? videoOptions322.getVideoQuality() : null, value.getRoundFaceFrameEnabled(), 32);
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "take_photo";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CameraTakeResult h(@NotNull File originalFile, @NotNull String uidKey, String str) throws Exception {
        Integer num;
        File file;
        FileOutputStream fileOutputStream;
        String stringData;
        Intrinsics.checkNotNullParameter(originalFile, "originalFile");
        Intrinsics.checkNotNullParameter(uidKey, "uidKey");
        FeatureValue b11 = this.f35596f.q(S90.c.MOB_PHOTO_COMPRESS_PERCENT).b();
        boolean isEnabled = b11.isEnabled();
        Context context = this.f35592b;
        if (isEnabled) {
            try {
                stringData = b11.getStringData();
            } catch (Exception unused) {
            }
            try {
                try {
                    if (stringData != null) {
                        num = Integer.valueOf((int) (Float.parseFloat(stringData) * 100));
                        int intValue = num == null ? num.intValue() : 80;
                        Intrinsics.checkNotNullParameter(originalFile, "originalFile");
                        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(originalFile.getPath());
                        Bitmap decodeFile = BitmapFactory.decodeFile(originalFile.getPath());
                        file = new File(context.getCacheDir(), originalFile.getName());
                        file.createNewFile();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        decodeFile.compress(Bitmap.CompressFormat.JPEG, intValue, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(byteArray);
                        fileOutputStream.flush();
                        Unit unit = Unit.f71690a;
                        fileOutputStream.close();
                        androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(file.getPath());
                        g(aVar, aVar2);
                        aVar2.D();
                    }
                    androidx.exifinterface.media.a aVar22 = new androidx.exifinterface.media.a(file.getPath());
                    g(aVar, aVar22);
                    aVar22.D();
                } catch (IOException e11) {
                    L80.a.a("CameraTakePhotoBridgeInterface", "error save compress exif: " + e11);
                }
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                Unit unit2 = Unit.f71690a;
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    Vd0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
            num = null;
            if (num == null) {
            }
            Intrinsics.checkNotNullParameter(originalFile, "originalFile");
            androidx.exifinterface.media.a aVar3 = new androidx.exifinterface.media.a(originalFile.getPath());
            Bitmap decodeFile2 = BitmapFactory.decodeFile(originalFile.getPath());
            file = new File(context.getCacheDir(), originalFile.getName());
            file.createNewFile();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            decodeFile2.compress(Bitmap.CompressFormat.JPEG, intValue, byteArrayOutputStream2);
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            fileOutputStream = new FileOutputStream(file);
        } else {
            file = originalFile;
        }
        String name = originalFile.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String name2 = originalFile.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        String substring = name.substring(0, kotlin.text.h.f(name2, ".", 0, 6));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        File file2 = new File(context.getCacheDir(), U7.d.e(substring, "b"));
        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
        FileInputStream fileInputStream = new FileInputStream(file);
        Base64OutputStream base64OutputStream = new Base64OutputStream(fileOutputStream2, 2);
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        for (int read = fileInputStream.read(bArr); read >= 0; read = fileInputStream.read(bArr)) {
            base64OutputStream.write(bArr, 0, read);
        }
        base64OutputStream.close();
        fileInputStream.close();
        String str2 = new String(bd.h.j(file2), Charsets.f71942b);
        String str3 = str2 + uidKey;
        Intrinsics.checkNotNullParameter(str3, "<this>");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] a11 = l.a(bytes);
        String a12 = a11 != null ? C3133b.a(a11) : null;
        if (file.exists()) {
            file.delete();
        }
        if (file2.exists()) {
            file2.delete();
        }
        if (a12 != null) {
            return new CameraTakeResult(str2, a12, null, null, null, null, str, null, 188, null);
        }
        return null;
    }
}
