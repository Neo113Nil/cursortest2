package com.facetec.sdk;

/* loaded from: classes8.dex */
final class eb {

    /* renamed from: a, reason: collision with root package name */
    private static android.os.Handler f3541a = null;
    private static android.media.MediaPlayer b = null;
    static android.content.SharedPreferences c = null;
    private static java.lang.Object d = new java.lang.Object();
    static boolean e = false;
    private static android.media.MediaPlayer f = null;
    private static android.media.MediaPlayer g = null;
    private static android.media.MediaPlayer h = null;
    private static android.media.MediaPlayer i = null;
    private static android.media.MediaPlayer j = null;
    private static android.speech.tts.TextToSpeech k = null;
    private static boolean l = false;
    private static boolean m = false;
    private static boolean n = false;

    /* renamed from: o, reason: collision with root package name */
    private static int f3542o = 0;
    private static java.lang.String t = "";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(int i2) {
    }

    eb() {
    }

    enum c {
        GET_READY_PRESS_BUTTON_TAPPING("GET_READY_PRESS_BUTTON_TAPPING"),
        GET_READY_FRAME_YOUR_FACE_TAPPING("GET_READY_FRAME_YOUR_FACE_TAPPING"),
        GET_READY_PRESS_BUTTON_DELAYED("GET_READY_PRESS_BUTTON_DELAYED"),
        GET_READY_FRAME_YOUR_FACE_AUTOMATIC("GET_READY_FRAME_YOUR_FACE_AUTOMATIC"),
        RETRY_PRESS_BUTTON_TAPPING("RETRY_PRESS_BUTTON_TAPPING"),
        FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING("FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING"),
        FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED("FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED"),
        FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING("FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING"),
        FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING("FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING"),
        FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC("FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC"),
        FACE_CAPTURE_MOVE_CLOSER_DELAYED("FACE_CAPTURE_MOVE_CLOSER_DELAYED"),
        BLIND_USER_ASSIST_TAP_PROMPT("BLIND_USER_ASSIST_TAP_PROMPT"),
        BLIND_USER_ASSIST_FACESCAN_FEEDBACK("BLIND_USER_ASSIST_FACESCAN_FEEDBACK"),
        SUCCESS("SUCCESS"),
        UPLOADING("UPLOADING"),
        RETRY("RETRY");

        final java.lang.String p;

        c(java.lang.String str) {
            this.p = str;
        }
    }

    private static boolean g() {
        return b == null || g == null || f == null || i == null || h == null || j == null;
    }

    private static void a(android.content.Context context) {
        synchronized (com.facetec.sdk.eb.class) {
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = accessibilityManager.getEnabledAccessibilityServiceList(1).iterator();
                while (it.hasNext()) {
                    if (it.next().getId().contains("TalkBackService")) {
                        l = true;
                    }
                }
            }
            if (l) {
                com.facetec.sdk.cq.O();
                if (k == null) {
                    k = new android.speech.tts.TextToSpeech(context, new android.speech.tts.TextToSpeech.OnInitListener() { // from class: com.facetec.sdk.eb$$ExternalSyntheticLambda2
                        @Override // android.speech.tts.TextToSpeech.OnInitListener
                        public final void onInit(int i2) {
                            com.facetec.sdk.eb.b(i2);
                        }
                    });
                }
            }
        }
    }

    static void c() {
        android.speech.tts.TextToSpeech textToSpeech = k;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            k = null;
        }
    }

    static void e() {
        com.facetec.sdk.cq.M("acced", n);
        com.facetec.sdk.cq.F("accen", t);
    }

    static void e(java.lang.String str) {
        if (n || !m) {
            return;
        }
        n = true;
        t = str;
        e();
    }

    static boolean d() {
        return l;
    }

    static void b() {
        android.speech.tts.TextToSpeech textToSpeech = k;
        if (textToSpeech == null || !textToSpeech.isSpeaking()) {
            return;
        }
        k.stop();
    }

    static void d(int i2) {
        f3542o = i2;
    }

    static void a(android.content.Context context, java.lang.String str) {
        try {
            android.speech.tts.TextToSpeech textToSpeech = k;
            if (textToSpeech != null) {
                textToSpeech.speak(str, 0, null);
            }
        } catch (java.lang.Throwable th) {
            com.facetec.sdk.t.c(context, com.facetec.sdk.c.VG_PLAY_SOUND_ERROR, th.getMessage(), th);
        }
    }

    static void b(android.content.Context context, com.facetec.sdk.eb.c cVar) {
        if (l || !(com.facetec.sdk.ai.f3384a || g() || b.isPlaying() || g.isPlaying() || f.isPlaying() || i.isPlaying() || h.isPlaying() || j.isPlaying() || com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE)) {
            switch (com.facetec.sdk.eb.AnonymousClass3.b[cVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    c(context, j);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    c(context, b);
                    break;
                case 9:
                case 10:
                case 11:
                    c(context, g);
                    break;
                case 12:
                    c(context, h);
                    break;
                case 13:
                    c(context, i);
                    break;
                case 14:
                    c(context, f);
                    break;
                case 15:
                    a(context, context.getString(com.facetec.sdk.R.string.FaceTec_accessibility_tap_guidance));
                    break;
                case 16:
                    a(context, context.getString(f3542o));
                    break;
            }
            com.facetec.sdk.t.c(context, cVar);
        }
    }

    /* renamed from: com.facetec.sdk.eb$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.facetec.sdk.eb.c.values().length];
            b = iArr;
            try {
                iArr[com.facetec.sdk.eb.c.GET_READY_PRESS_BUTTON_TAPPING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.facetec.sdk.eb.c.GET_READY_PRESS_BUTTON_DELAYED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.facetec.sdk.eb.c.RETRY_PRESS_BUTTON_TAPPING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                b[com.facetec.sdk.eb.c.GET_READY_FRAME_YOUR_FACE_TAPPING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                b[com.facetec.sdk.eb.c.GET_READY_FRAME_YOUR_FACE_AUTOMATIC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                b[com.facetec.sdk.eb.c.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                b[com.facetec.sdk.eb.c.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                b[com.facetec.sdk.eb.c.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                b[com.facetec.sdk.eb.c.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                b[com.facetec.sdk.eb.c.FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                b[com.facetec.sdk.eb.c.FACE_CAPTURE_MOVE_CLOSER_DELAYED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                b[com.facetec.sdk.eb.c.SUCCESS.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                b[com.facetec.sdk.eb.c.UPLOADING.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                b[com.facetec.sdk.eb.c.RETRY.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                b[com.facetec.sdk.eb.c.BLIND_USER_ASSIST_TAP_PROMPT.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                b[com.facetec.sdk.eb.c.BLIND_USER_ASSIST_FACESCAN_FEEDBACK.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
        }
    }

    static void d(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        com.facetec.sdk.FaceTecVocalGuidanceCustomization faceTecVocalGuidanceCustomization = com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization;
        a(applicationContext);
        b = c(applicationContext, faceTecVocalGuidanceCustomization.pleaseFrameYourFaceInTheOvalSoundFile);
        g = c(applicationContext, faceTecVocalGuidanceCustomization.pleaseMoveCloserSoundFile);
        f = c(applicationContext, faceTecVocalGuidanceCustomization.pleaseRetrySoundFile);
        i = c(applicationContext, faceTecVocalGuidanceCustomization.uploadingSoundFile);
        h = c(applicationContext, faceTecVocalGuidanceCustomization.facescanSuccessfulSoundFile);
        j = c(applicationContext, faceTecVocalGuidanceCustomization.pleasePressTheButtonToStartSoundFile);
        if (g()) {
            android.util.Log.i("FaceTecSDK", "WARNING: Vocal Guidance files were not provided.\nThese files can be set using FaceTecVocalGuidanceCustomization.\nDocumentation: https://dev.facetec.com/ui-customization#vocal-guidance\n");
            com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode = com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE;
        }
        android.content.SharedPreferences g2 = com.facetec.sdk.bj.g(applicationContext);
        c = g2;
        e = g2.getBoolean("facetecMoveCloserSoundHasBeenPlayed", false);
        m = true;
    }

    private static android.media.MediaPlayer c(android.content.Context context, int i2) {
        if (i2 == -1) {
            return null;
        }
        return android.media.MediaPlayer.create(context, i2);
    }

    private static void c(android.content.Context context, android.media.MediaPlayer mediaPlayer) {
        if (d()) {
            return;
        }
        try {
            mediaPlayer.start();
        } catch (java.lang.Throwable th) {
            com.facetec.sdk.t.c(context, com.facetec.sdk.c.VG_PLAY_SOUND_ERROR, th.getMessage(), th);
        }
    }

    static void a() {
        android.media.MediaPlayer mediaPlayer = b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            b = null;
        }
        android.media.MediaPlayer mediaPlayer2 = g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            g = null;
        }
        android.media.MediaPlayer mediaPlayer3 = f;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
            f = null;
        }
        android.media.MediaPlayer mediaPlayer4 = j;
        if (mediaPlayer4 != null) {
            mediaPlayer4.release();
            j = null;
        }
        android.media.MediaPlayer mediaPlayer5 = i;
        if (mediaPlayer5 != null) {
            mediaPlayer5.release();
            i = null;
        }
        android.media.MediaPlayer mediaPlayer6 = h;
        if (mediaPlayer6 != null) {
            mediaPlayer6.release();
            h = null;
        }
        if (c != null) {
            h = null;
        }
    }

    static void e(final android.content.Context context) {
        f3541a = new android.os.Handler();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.facetec.sdk.eb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.eb.b(context);
            }
        };
        if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            f3541a.postDelayed(runnable, 4500L);
        } else if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.MINIMAL_VOCAL_GUIDANCE) {
            f3541a.postDelayed(runnable, 15000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(android.content.Context context) {
        if (com.facetec.sdk.cq.j() == com.facetec.sdk.cm.ZOOM_FAR) {
            b(context, com.facetec.sdk.eb.c.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED);
        }
    }

    static void i() {
        synchronized (d) {
            android.os.Handler handler = f3541a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                f3541a = null;
            }
        }
    }

    static void d(final com.facetec.sdk.bl blVar) {
        if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode != com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
            blVar.M.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facetec.sdk.eb$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    boolean b2;
                    b2 = com.facetec.sdk.eb.b(com.facetec.sdk.bl.this, blVar, view, motionEvent);
                    return b2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(com.facetec.sdk.bl blVar, android.content.Context context, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (blVar.getFragmentManager().findFragmentByTag("PreEnroll") != null) {
                com.facetec.sdk.bg bgVar = (com.facetec.sdk.bg) blVar.getFragmentManager().findFragmentByTag("PreEnroll");
                if (bgVar.e == null || com.facetec.sdk.bx.n) {
                    return true;
                }
                if (bgVar.e.isEnabled()) {
                    b(context, com.facetec.sdk.eb.c.GET_READY_PRESS_BUTTON_TAPPING);
                } else {
                    b(context, com.facetec.sdk.eb.c.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                }
            } else if (blVar.getFragmentManager().findFragmentByTag("RetryFaceScan") != null) {
                com.facetec.sdk.bg bgVar2 = (com.facetec.sdk.bg) blVar.getFragmentManager().findFragmentByTag("RetryFaceScan");
                if (bgVar2.e == null || com.facetec.sdk.cx.n) {
                    return true;
                }
                if (bgVar2.e.isEnabled()) {
                    b(context, com.facetec.sdk.eb.c.GET_READY_PRESS_BUTTON_TAPPING);
                } else if (((com.facetec.sdk.cx) bgVar2).f3483o == 1) {
                    b(context, com.facetec.sdk.eb.c.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                }
            } else if (blVar.getFragmentManager().findFragmentByTag("FaceScan") != null) {
                if (blVar.H != com.facetec.sdk.bl.d.FACESCAN_SESSION_STARTED) {
                    if (((com.facetec.sdk.az) blVar.getFragmentManager().findFragmentByTag("FaceScan")).c == com.facetec.sdk.ct.FRAME_YOUR_FACE) {
                        b(context, com.facetec.sdk.eb.c.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                    }
                } else if (com.facetec.sdk.cq.j() == com.facetec.sdk.cm.ZOOM_CLOSE) {
                    int b2 = com.facetec.sdk.gj.AnonymousClass32.b();
                    int b3 = com.facetec.sdk.gj.AnonymousClass32.b();
                    if (((com.facetec.sdk.cl) com.facetec.sdk.cq.c(984600981, -984600979, com.facetec.sdk.gj.AnonymousClass32.b(), b2, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b3)) == com.facetec.sdk.cl.MOVE_FACE_CLOSER) {
                        b(context, com.facetec.sdk.eb.c.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING);
                    } else {
                        int b4 = com.facetec.sdk.gj.AnonymousClass32.b();
                        int b5 = com.facetec.sdk.gj.AnonymousClass32.b();
                        if (((com.facetec.sdk.cl) com.facetec.sdk.cq.c(984600981, -984600979, com.facetec.sdk.gj.AnonymousClass32.b(), b4, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b5)) != com.facetec.sdk.cl.HOLD_STEADY) {
                            b(context, com.facetec.sdk.eb.c.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                        }
                    }
                } else if (com.facetec.sdk.cq.j() == com.facetec.sdk.cm.ZOOM_FAR) {
                    int b6 = com.facetec.sdk.gj.AnonymousClass32.b();
                    int b7 = com.facetec.sdk.gj.AnonymousClass32.b();
                    if (((com.facetec.sdk.cl) com.facetec.sdk.cq.c(984600981, -984600979, com.facetec.sdk.gj.AnonymousClass32.b(), b6, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b7)) != com.facetec.sdk.cl.HOLD_STEADY) {
                        b(context, com.facetec.sdk.eb.c.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                    }
                }
            }
        }
        return true;
    }
}
