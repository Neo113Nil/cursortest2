package Qc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.lang.reflect.Array;

/* loaded from: classes10.dex */
final class a {
    public static Bitmap a(Context context, Bitmap bitmap, b bVar) {
        int i11;
        int i12 = bVar.f23219a;
        int i13 = bVar.f23220b;
        int[] iArr = {i12, i13};
        int i14 = 0;
        while (true) {
            Bitmap bitmap2 = null;
            if (i14 >= 2) {
                Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f7 = 1.0f / 1;
                canvas.scale(f7, f7);
                Paint paint = new Paint();
                paint.setFlags(3);
                paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                try {
                    b(context, createBitmap, bVar.f23221c);
                    return createBitmap;
                } catch (RSRuntimeException unused) {
                    int i15 = bVar.f23221c;
                    if (i15 >= 1) {
                        int width = createBitmap.getWidth();
                        int height = createBitmap.getHeight();
                        int i16 = width * height;
                        int[] iArr2 = new int[i16];
                        createBitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
                        int i17 = width - 1;
                        int i18 = height - 1;
                        int i19 = i15 + i15;
                        int i21 = i19 + 1;
                        int[] iArr3 = new int[i16];
                        int[] iArr4 = new int[i16];
                        int[] iArr5 = new int[i16];
                        int[] iArr6 = new int[Math.max(width, height)];
                        int i22 = (i19 + 2) >> 1;
                        int i23 = i22 * i22;
                        int i24 = i23 * 256;
                        int i25 = 0;
                        int[] iArr7 = new int[i24];
                        for (int i26 = 0; i26 < i24; i26++) {
                            iArr7[i26] = i26 / i23;
                        }
                        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i21, 3);
                        int i27 = i15 + 1;
                        int i28 = 0;
                        int i29 = 0;
                        int i31 = 0;
                        while (i28 < height) {
                            int[] iArr9 = iArr5;
                            int i32 = -i15;
                            int i33 = i25;
                            int i34 = i33;
                            int i35 = i34;
                            int i36 = i35;
                            int i37 = i36;
                            int i38 = i37;
                            int i39 = i38;
                            int i41 = i39;
                            int i42 = i41;
                            while (i32 <= i15) {
                                int[] iArr10 = iArr6;
                                int[] iArr11 = iArr7;
                                int i43 = i25;
                                int i44 = iArr2[Math.min(i17, Math.max(i32, i43)) + i29];
                                int[] iArr12 = iArr8[i32 + i15];
                                iArr12[i43] = (i44 & 16711680) >> 16;
                                iArr12[1] = (i44 & 65280) >> 8;
                                iArr12[2] = i44 & 255;
                                int abs = i27 - Math.abs(i32);
                                int i45 = iArr12[i43];
                                i33 = (i45 * abs) + i33;
                                int i46 = iArr12[1];
                                i34 = (i46 * abs) + i34;
                                int i47 = iArr12[2];
                                i35 = (abs * i47) + i35;
                                if (i32 > 0) {
                                    i39 += i45;
                                    i41 += i46;
                                    i42 += i47;
                                } else {
                                    i36 += i45;
                                    i37 += i46;
                                    i38 += i47;
                                }
                                i32++;
                                iArr6 = iArr10;
                                iArr7 = iArr11;
                                i25 = 0;
                            }
                            int[] iArr13 = iArr6;
                            int[] iArr14 = iArr7;
                            int i48 = i15;
                            int i49 = 0;
                            while (i49 < width) {
                                iArr3[i29] = iArr14[i33];
                                iArr4[i29] = iArr14[i34];
                                iArr9[i29] = iArr14[i35];
                                int i51 = i33 - i36;
                                int i52 = i34 - i37;
                                int i53 = i35 - i38;
                                int[] iArr15 = iArr8[((i48 - i15) + i21) % i21];
                                int i54 = i36 - iArr15[0];
                                int i55 = i37 - iArr15[1];
                                int i56 = i38 - iArr15[2];
                                if (i28 == 0) {
                                    i11 = i49;
                                    iArr13[i11] = Math.min(i49 + i15 + 1, i17);
                                } else {
                                    i11 = i49;
                                }
                                int i57 = iArr2[i31 + iArr13[i11]];
                                int i58 = (i57 & 16711680) >> 16;
                                iArr15[0] = i58;
                                int i59 = (i57 & 65280) >> 8;
                                iArr15[1] = i59;
                                int i61 = i57 & 255;
                                iArr15[2] = i61;
                                int i62 = i39 + i58;
                                int i63 = i41 + i59;
                                int i64 = i42 + i61;
                                i33 = i51 + i62;
                                i34 = i52 + i63;
                                i35 = i53 + i64;
                                i48 = (i48 + 1) % i21;
                                int[] iArr16 = iArr8[i48 % i21];
                                int i65 = iArr16[0];
                                i36 = i54 + i65;
                                int i66 = iArr16[1];
                                i37 = i55 + i66;
                                int i67 = iArr16[2];
                                i38 = i56 + i67;
                                i39 = i62 - i65;
                                i41 = i63 - i66;
                                i42 = i64 - i67;
                                i29++;
                                i49 = i11 + 1;
                            }
                            i31 += width;
                            i28++;
                            iArr5 = iArr9;
                            iArr6 = iArr13;
                            iArr7 = iArr14;
                            i25 = 0;
                        }
                        int[] iArr17 = iArr5;
                        int[] iArr18 = iArr6;
                        int[] iArr19 = iArr7;
                        int i68 = 0;
                        while (i68 < width) {
                            int i69 = -i15;
                            int i71 = i69 * width;
                            int i72 = 0;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i81 = 0;
                            while (i69 <= i15) {
                                int i82 = i15;
                                int max = Math.max(0, i71) + i68;
                                int[] iArr20 = iArr8[i69 + i82];
                                iArr20[0] = iArr3[max];
                                iArr20[1] = iArr4[max];
                                iArr20[2] = iArr17[max];
                                int abs2 = i27 - Math.abs(i69);
                                i72 = (iArr3[max] * abs2) + i72;
                                i73 = (iArr4[max] * abs2) + i73;
                                i74 = (iArr17[max] * abs2) + i74;
                                if (i69 > 0) {
                                    i78 += iArr20[0];
                                    i79 += iArr20[1];
                                    i81 += iArr20[2];
                                } else {
                                    i75 += iArr20[0];
                                    i76 += iArr20[1];
                                    i77 += iArr20[2];
                                }
                                if (i69 < i18) {
                                    i71 += width;
                                }
                                i69++;
                                i15 = i82;
                            }
                            int i83 = i15;
                            int i84 = i68;
                            int i85 = i83;
                            int i86 = 0;
                            while (i86 < height) {
                                iArr2[i84] = (iArr2[i84] & (-16777216)) | (iArr19[i72] << 16) | (iArr19[i73] << 8) | iArr19[i74];
                                int i87 = i72 - i75;
                                int i88 = i73 - i76;
                                int i89 = i74 - i77;
                                int[] iArr21 = iArr8[((i85 - i83) + i21) % i21];
                                int i91 = i75 - iArr21[0];
                                int i92 = i76 - iArr21[1];
                                int i93 = i77 - iArr21[2];
                                int i94 = i86;
                                if (i68 == 0) {
                                    iArr18[i94] = Math.min(i94 + i27, i18) * width;
                                }
                                int i95 = iArr18[i94] + i68;
                                int i96 = iArr3[i95];
                                iArr21[0] = i96;
                                int i97 = iArr4[i95];
                                iArr21[1] = i97;
                                int i98 = iArr17[i95];
                                iArr21[2] = i98;
                                int i99 = i78 + i96;
                                int i100 = i79 + i97;
                                int i101 = i81 + i98;
                                i72 = i87 + i99;
                                i73 = i88 + i100;
                                i74 = i89 + i101;
                                i85 = (i85 + 1) % i21;
                                int[] iArr22 = iArr8[i85];
                                int i102 = iArr22[0];
                                i75 = i91 + i102;
                                int i103 = iArr22[1];
                                i76 = i92 + i103;
                                int i104 = iArr22[2];
                                i77 = i93 + i104;
                                i78 = i99 - i102;
                                i79 = i100 - i103;
                                i81 = i101 - i104;
                                i84 += width;
                                i86 = i94 + 1;
                            }
                            i68++;
                            i15 = i83;
                        }
                        createBitmap.setPixels(iArr2, 0, width, 0, 0, width, height);
                        bitmap2 = createBitmap;
                    }
                    return bitmap2;
                }
            }
            if (iArr[i14] == 0) {
                return null;
            }
            i14++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(Context context, Bitmap bitmap, int i11) throws RSRuntimeException {
        Allocation allocation;
        Allocation allocation2;
        Allocation allocation3;
        RenderScript create;
        ScriptIntrinsicBlur scriptIntrinsicBlur = null;
        try {
            create = RenderScript.create(context);
            try {
                create.setMessageHandler(new RenderScript.RSMessageHandler());
                allocation2 = Allocation.createFromBitmap(create, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocation3 = Allocation.createTyped(create, allocation2.getType());
                } catch (Throwable th2) {
                    th = th2;
                    allocation3 = null;
                    scriptIntrinsicBlur = create;
                    allocation = allocation3;
                    if (scriptIntrinsicBlur != null) {
                        RenderScript.releaseAllContexts();
                    }
                    if (allocation2 != null) {
                        allocation2.destroy();
                    }
                    if (allocation3 != null) {
                        allocation3.destroy();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                allocation2 = null;
                allocation3 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            allocation = null;
            allocation2 = null;
            allocation3 = null;
        }
        try {
            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            scriptIntrinsicBlur.setInput(allocation2);
            scriptIntrinsicBlur.setRadius(i11);
            scriptIntrinsicBlur.forEach(allocation3);
            allocation3.copyTo(bitmap);
            RenderScript.releaseAllContexts();
            allocation2.destroy();
            allocation3.destroy();
            scriptIntrinsicBlur.destroy();
        } catch (Throwable th5) {
            th = th5;
            Allocation allocation4 = scriptIntrinsicBlur;
            scriptIntrinsicBlur = create;
            allocation = allocation4;
            if (scriptIntrinsicBlur != null) {
            }
            if (allocation2 != null) {
            }
            if (allocation3 != null) {
            }
            if (allocation != null) {
            }
            throw th;
        }
    }
}
