package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CM extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC1205eC, InterfaceC1221eS, InterfaceC1207eE {
    public static byte[] A0O;
    public static String[] A0P = {"HP", "vI", "IkPvJjq0d6kyiPKTTS2lCNhYTces79dt", "hRUerIi7AJ3jOkGNT2UiHpaxkSFge2bW", "Avvx3DFr2S27", "gmbQyyKnf6LsZqIL76N8lXPSt8AAYSbH", "tA8cc29oavr4xgkZce", "dMNAf6LzALyzJxRA4XpvvVCIX8V0s"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C1153dL A0A;
    public EnumC1169db A0B;
    public C1208eF A0C;
    public EnumC1223eU A0D;
    public EnumC1223eU A0E;
    public InterfaceC1224eV A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{-54, -14, -14, -22, -17, -24, -93, -28, -17, -6, -28, -4, -10, -93, -9, -21, -11, -14, -6, -93, -28, -15, -93, -24, -5, -26, -24, -13, -9, -20, -14, -15, -93, -6, -20, -9, -21, -93, -10, -24, -9, -59, -28, -26, -18, -22, -11, -14, -8, -15, -25, -57, -11, -28, -6, -28, -27, -17, -24, -93, -14, -15, -93, -47, -14, -8, -22, -28, -9, -93, -28, -27, -14, -7, -24, -79, -93, -10, -14, -93, -6, -24, -93, -10, -20, -17, -24, -15, -9, -17, -4, -93, -20, -22, -15, -14, -11, -24, -93, -20, -9, -79, -22, Ascii.DC2, Ascii.DC2, 10, Ascii.SI, 8, -61, 4, Ascii.SI, Ascii.SUB, 4, Ascii.FS, Ascii.SYN, -61, Ascii.ETB, Ascii.VT, Ascii.NAK, Ascii.DC2, Ascii.SUB, -61, 4, 17, -61, 8, Ascii.ESC, 6, 8, 19, Ascii.ETB, Ascii.FF, Ascii.DC2, 17, -61, Ascii.SUB, Ascii.FF, Ascii.ETB, Ascii.VT, -61, Ascii.SYN, 8, Ascii.ETB, -23, Ascii.DC2, Ascii.NAK, 8, 10, Ascii.NAK, Ascii.DC2, Ascii.CAN, 17, 7, -61, Ascii.DC2, 17, -61, -15, Ascii.DC2, Ascii.CAN, 10, 4, Ascii.ETB, -61, 4, 5, Ascii.DC2, Ascii.EM, 8, -47, -61, Ascii.SYN, Ascii.DC2, -61, Ascii.SUB, 8, -61, Ascii.SYN, Ascii.FF, Ascii.SI, 8, 17, Ascii.ETB, Ascii.SI, Ascii.FS, -61, Ascii.FF, 10, 17, Ascii.DC2, Ascii.NAK, 8, -61, Ascii.FF, Ascii.ETB, -47, -11, 8, 3, 4, Ascii.SO, -65, Ascii.DC2, 19, 0, 19, 4, -65, 2, 7, 0, Ascii.CR, 6, 4, 3, -65, 19, Ascii.SO, -65, -60, -62, -53, -62, -49, -58, -64};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (U7.A1v(this.A0A)) {
            EnumC1223eU enumC1223eU = this.A0D;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[0] = "Md";
            strArr[1] = "f0";
            if (enumC1223eU == EnumC1223eU.A08) {
                return;
            }
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0F().AIF();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long currentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0F != null) {
                this.A0F.ADK(currentPosition, currentPosition2, currentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = CM.class.getSimpleName();
    }

    public CM(C1153dL c1153dL) {
        super(c1153dL);
        this.A0D = EnumC1223eU.A04;
        this.A0E = EnumC1223eU.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1169db.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1153dL;
    }

    public CM(C1153dL c1153dL, AttributeSet attributeSet) {
        super(c1153dL, attributeSet);
        this.A0D = EnumC1223eU.A04;
        this.A0E = EnumC1223eU.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1169db.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1153dL;
    }

    public CM(C1153dL c1153dL, AttributeSet attributeSet, int i) {
        super(c1153dL, attributeSet, i);
        this.A0D = EnumC1223eU.A04;
        this.A0E = EnumC1223eU.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1169db.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1153dL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r5.A0K == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A04() {
        this.A0C = new C1208eF(this.A0A);
        this.A0C.A0H(this);
        this.A0C.A0G(this);
        this.A0C.A0I(false);
        if (this.A0J && !this.A0I) {
            Activity A0E = this.A0A.A0E();
            if (A0E != null) {
                this.A09 = new MediaController(A0E);
                this.A09.setAnchorView(this.A08 == null ? this : this.A08);
                this.A09.setMediaPlayer(new C1214eL(this));
                this.A09.setEnabled(true);
            } else if (A0P[5].charAt(4) != 'y') {
                A0P[6] = "TO7k5EC8ZWp6tpojZW";
                this.A09 = null;
            } else {
                String[] strArr = A0P;
                strArr[0] = "fS";
                strArr[1] = "9d";
                this.A09 = null;
            }
        }
        if (this.A0G != null) {
            String str = this.A0G;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[0] = "Pg";
            strArr2[1] = "vu";
            if (str.length() != 0) {
            }
        }
        this.A0C.A0F(this.A0A.A02(), this.A06);
        setVideoState(EnumC1223eU.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        C1206eD videoFormat;
        if (this.A0C != null && (videoFormat = this.A0C.A08()) != null) {
            A08(videoFormat.A01, videoFormat.A00);
        }
    }

    private void A06() {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
        }
        if (this.A0C != null) {
            this.A0C.A09();
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(EnumC1223eU.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C1208eF.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9V();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final void A9V() {
        if (!this.A0H) {
            AG7(false, 3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final boolean A9i() {
        return this.A0C != null && this.A0C.A0K();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final boolean A9j() {
        return this.A0N;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final boolean AAT() {
        return this.A0M;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1205eC
    public final void AEe(String str, Exception exc) {
        this.A0A.A0F().ABx(str);
        this.A0A.A0F().A3a(1);
        setVideoState(EnumC1223eU.A03);
        this.A0A.A08().AAy(A03(219, 7, 15), AbstractC0766Sv.A1N, new C0767Sw(exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r3 = com.instagram.common.viewpoint.core.EnumC1223eU.A05;
        r2 = com.instagram.common.viewpoint.core.CM.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r2[4].length() == r2[7].length()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        com.instagram.common.viewpoint.core.CM.A0P[6] = "dNFvbzP2EYglZVOCcO";
        setVideoState(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (r3 != false) goto L19;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1205eC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEf(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        switch (i) {
            case 1:
                setVideoState(EnumC1223eU.A04);
                return;
            case 2:
                A05();
                if (this.A01 < 0) {
                    return;
                }
                int i2 = this.A01;
                this.A01 = -1;
                if (this.A0F == null) {
                    return;
                }
                InterfaceC1224eV interfaceC1224eV = this.A0F;
                int seekFrom = getCurrentPosition();
                interfaceC1224eV.AF9(i2, seekFrom);
                return;
            case 3:
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                if (this.A05 > 0 && this.A05 < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z) {
                    boolean z2 = this.A0N;
                    if (A0P[5].charAt(4) == 'y') {
                        A0P[5] = "3r7lyS1P0Mh4AObuDTaZ0iezAfx5hfrS";
                        break;
                    } else {
                        String[] strArr = A0P;
                        strArr[3] = "T7dswaxt6nrXidjLTysunwDPvSX4Ru7O";
                        strArr[2] = "ANtZP5BaeS0Nfv6aTfoZkiJnjx34FJZx";
                        break;
                    }
                }
                if (z || this.A0D == EnumC1223eU.A06) {
                    return;
                }
                setVideoState(EnumC1223eU.A07);
                EnumC1223eU enumC1223eU = this.A0E;
                String[] strArr2 = A0P;
                if (strArr2[3].charAt(16) != strArr2[2].charAt(16)) {
                    throw new RuntimeException();
                }
                A0P[6] = "MPZySUBjU8eQIDiJ8j";
                if (enumC1223eU != EnumC1223eU.A0A) {
                    return;
                }
                AJM(this.A0B, 8);
                this.A0E = EnumC1223eU.A04;
                return;
            case 4:
                if (z) {
                    setVideoState(EnumC1223eU.A06);
                }
                if (this.A0C != null) {
                    this.A0C.A0I(false);
                    if (A0P[5].charAt(4) == 'y') {
                        String[] strArr3 = A0P;
                        strArr3[4] = "0npepmR7M4IL";
                        strArr3[7] = "iLUr5jfc2zzHXCQiIz3oIHQjifgBE";
                        if (!z) {
                            this.A0C.A0A();
                        }
                    }
                }
                this.A0N = false;
                return;
            default:
                return;
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1207eE
    public final void AFq(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final void AG7(boolean z, int i) {
        this.A0A.A0F().A3W(i);
        this.A0E = EnumC1223eU.A05;
        this.A0M = z;
        if (this.A0C != null) {
            this.A0C.A0I(false);
        } else {
            setVideoState(EnumC1223eU.A04);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final void AJH(int i) {
        this.A0A.A0F().ABy(i);
        setVideoState(EnumC1223eU.A09);
        AJU(5);
        this.A05 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final void AJM(EnumC1169db enumC1169db, int i) {
        this.A0A.A0F().A3h(i);
        this.A0M = false;
        this.A0E = EnumC1223eU.A0A;
        this.A0B = enumC1169db;
        if (this.A0C == null) {
            setup(this.A06);
            return;
        }
        if (this.A0D != EnumC1223eU.A07 && this.A0D != EnumC1223eU.A05 && this.A0D != EnumC1223eU.A06) {
            return;
        }
        this.A0C.A0I(true);
        EnumC1223eU enumC1223eU = EnumC1223eU.A0A;
        String[] strArr = A0P;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[0] = "Wi";
        strArr2[1] = "9L";
        setVideoState(enumC1223eU);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final void AJU(int i) {
        this.A0A.A0F().A3j(i);
        this.A0E = EnumC1223eU.A04;
        if (this.A0C != null) {
            this.A0C.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC1223eU.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final void destroy() {
        A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public int getCurrentPosition() {
        if (this.A0C != null) {
            return (int) this.A0C.A06();
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public int getDuration() {
        if (this.A0C == null) {
            return 0;
        }
        return (int) this.A0C.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public EnumC1169db getStartReason() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public EnumC1223eU getState() {
        return this.A0D;
    }

    public EnumC1223eU getTargetState() {
        return this.A0E;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public View getView() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (U7.A2d(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC1223eU.A03);
            AJU(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A07 != null) {
            this.A07.release();
        }
        this.A07 = new Surface(surfaceTexture);
        if (this.A0C == null) {
            return;
        }
        this.A0C.A0E(this.A07);
        if (this.A0D == EnumC1223eU.A05 && !this.A0M) {
            AJM(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
            if (this.A0C != null) {
                this.A0C.A0E(null);
            }
        }
        if (this.A0D != EnumC1223eU.A05) {
            AG7(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        if (this.A09 != null && this.A09.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != EnumC1223eU.A05) {
                if ((this.A0A.A0H().A01() || U7.A1z(this.A0A)) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.eK
                        @Override // java.lang.Runnable
                        public final void run() {
                            CM.this.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    A9V();
                    return;
                }
            }
            return;
        }
        if (this.A0D != EnumC1223eU.A05 || this.A0M) {
            return;
        }
        AJM(this.A0B, 9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
        } else {
            this.A05 = i;
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(0, 102, 53));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC1216eN(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(102, 94, 85));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new ViewOnTouchListenerC1215eM(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != EnumC1223eU.A08 && this.A0D != EnumC1223eU.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC1223eU enumC1223eU) {
        if (enumC1223eU != this.A0D) {
            if (this.A0A.A05().AAF()) {
                String str = A03(196, 23, 81) + enumC1223eU;
            }
            this.A0D = enumC1223eU;
            if (this.A0D == EnumC1223eU.A0A) {
                this.A0N = true;
            }
            if (this.A0F != null) {
                this.A0F.AFt(enumC1223eU);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public void setVideoStateChangeListener(InterfaceC1224eV interfaceC1224eV) {
        this.A0F = interfaceC1224eV;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1221eS
    public void setup(Uri uri) {
        this.A0A.A0F().A3Z();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
