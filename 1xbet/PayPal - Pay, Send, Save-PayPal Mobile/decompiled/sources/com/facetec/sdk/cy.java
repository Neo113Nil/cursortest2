package com.facetec.sdk;

/* loaded from: classes8.dex */
class cy extends android.widget.LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    android.widget.TextView f3484a;
    com.facetec.sdk.cl b;
    android.view.View c;
    int d;
    com.facetec.sdk.ct e;
    android.animation.Animator f;
    boolean g;
    final com.facetec.sdk.b h;
    android.os.Handler i;
    android.animation.Animator j;
    private android.view.animation.Animation l;

    /* renamed from: o, reason: collision with root package name */
    private final int f3485o;

    public cy(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3485o = 500;
        this.b = com.facetec.sdk.cl.FACE_NOT_FOUND;
        this.e = com.facetec.sdk.ct.FRAME_YOUR_FACE;
        this.d = 0;
        this.g = false;
        this.h = new com.facetec.sdk.b() { // from class: com.facetec.sdk.cy$$ExternalSyntheticLambda0
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                com.facetec.sdk.cy.this.e(animator);
            }
        };
    }

    public final void a() {
        final int i = 500;
        postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.cy$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cy.this.d(i);
            }
        }, 50L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        float y = getY();
        setVisibility(0);
        setAlpha(0.0f);
        setY(y - (this.c.getHeight() / 2));
        animate().setDuration(i).alpha(1.0f).y(y).setListener(null).start();
    }

    public final void d() {
        if (this.d == com.facetec.sdk.R.string.FaceTec_feedback_move_phone_closer) {
            android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.15f, 1.0f, 1.15f, 1, 0.5f, 1, 0.5f);
            this.l = scaleAnimation;
            scaleAnimation.setDuration(1000L);
            this.l.setRepeatMode(2);
            this.l.setRepeatCount(-1);
            this.f3484a.startAnimation(this.l);
            if (com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE || com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode == com.facetec.sdk.FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
                return;
            }
            android.os.Handler handler = new android.os.Handler();
            this.i = handler;
            handler.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.cy$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cy.this.b();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (com.facetec.sdk.eb.e || this.d != com.facetec.sdk.R.string.FaceTec_feedback_move_phone_closer) {
            return;
        }
        com.facetec.sdk.eb.b(getContext(), com.facetec.sdk.eb.c.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(android.animation.Animator animator) {
        com.facetec.sdk.dl.d(this.f3484a, this.d);
        android.view.animation.Animation animation = this.l;
        if (animation != null) {
            animation.cancel();
            this.l = null;
            this.f3484a.setScaleX(1.0f);
            this.f3484a.setScaleY(1.0f);
        }
        this.j.start();
    }

    final void e(int i) {
        if (this.g || i == this.d) {
            return;
        }
        this.d = i;
        this.g = true;
        com.facetec.sdk.eb.d(i);
        this.f.start();
        postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.cy$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cy.this.c();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.g = false;
    }

    static int a(com.facetec.sdk.ct ctVar) {
        int i = com.facetec.sdk.R.string.FaceTec_presession_frame_your_face;
        switch (com.facetec.sdk.cy.AnonymousClass3.b[ctVar.ordinal()]) {
            case 1:
                return com.facetec.sdk.R.string.FaceTec_presession_frame_your_face;
            case 2:
                return com.facetec.sdk.R.string.FaceTec_presession_frame_your_face;
            case 3:
                return com.facetec.sdk.R.string.FaceTec_presession_remove_dark_glasses;
            case 4:
                return com.facetec.sdk.R.string.FaceTec_presession_position_face_straight_in_oval;
            case 5:
                return com.facetec.sdk.R.string.FaceTec_presession_conditions_too_bright;
            case 6:
                return com.facetec.sdk.R.string.FaceTec_presession_brighten_your_environment;
            case 7:
                return com.facetec.sdk.R.string.FaceTec_presession_neutral_expression;
            case 8:
                return com.facetec.sdk.R.string.FaceTec_presession_hold_steady_3;
            case 9:
                return com.facetec.sdk.R.string.FaceTec_presession_hold_steady_2;
            case 10:
                return com.facetec.sdk.R.string.FaceTec_presession_hold_steady_1;
            case 11:
                return com.facetec.sdk.R.string.FaceTec_feedback_move_phone_closer;
            case 12:
                return com.facetec.sdk.R.string.FaceTec_feedback_move_phone_away;
            default:
                return i;
        }
    }

    static int a(com.facetec.sdk.cl clVar) {
        boolean d = com.facetec.sdk.eb.d();
        int i = com.facetec.sdk.R.string.FaceTec_feedback_face_not_found;
        switch (com.facetec.sdk.cy.AnonymousClass3.e[clVar.ordinal()]) {
            case 1:
                return com.facetec.sdk.R.string.FaceTec_feedback_hold_steady;
            case 2:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_not_on_camera : com.facetec.sdk.R.string.FaceTec_feedback_face_not_found;
            case 3:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_move_phone_closer : com.facetec.sdk.R.string.FaceTec_feedback_move_phone_closer;
            case 4:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_move_phone_closer : com.facetec.sdk.R.string.FaceTec_feedback_move_phone_closer;
            case 5:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_move_phone_away : com.facetec.sdk.R.string.FaceTec_feedback_move_phone_away;
            case 6:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_move_phone_away : com.facetec.sdk.R.string.FaceTec_feedback_move_phone_away;
            case 7:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_too_high : com.facetec.sdk.R.string.FaceTec_feedback_center_face;
            case 8:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_too_low : com.facetec.sdk.R.string.FaceTec_feedback_center_face;
            case 9:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_too_far_left : com.facetec.sdk.R.string.FaceTec_feedback_center_face;
            case 10:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_too_far_right : com.facetec.sdk.R.string.FaceTec_feedback_center_face;
            case 11:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_rotated_too_far_left : com.facetec.sdk.R.string.FaceTec_feedback_face_not_upright;
            case 12:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_rotated_too_far_right : com.facetec.sdk.R.string.FaceTec_feedback_face_not_upright;
            case 13:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_hold_device_to_eye_level : com.facetec.sdk.R.string.FaceTec_feedback_move_phone_to_eye_level;
            case 14:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_pointing_too_far_left : com.facetec.sdk.R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 15:
                return d ? com.facetec.sdk.R.string.FaceTec_accessibility_feedback_face_pointing_too_far_right : com.facetec.sdk.R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 16:
                return com.facetec.sdk.R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 17:
                return com.facetec.sdk.R.string.FaceTec_feedback_use_even_lighting;
            default:
                return i;
        }
    }

    /* renamed from: com.facetec.sdk.cy$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.cl.values().length];
            e = iArr;
            try {
                iArr[com.facetec.sdk.cl.HOLD_STEADY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_NOT_FOUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                e[com.facetec.sdk.cl.MOVE_FACE_CLOSER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                e[com.facetec.sdk.cl.MOVE_FACE_EVEN_CLOSER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                e[com.facetec.sdk.cl.MOVE_FACE_FURTHER_AWAY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                e[com.facetec.sdk.cl.MOVE_FACE_AWAY_A_LITTLE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_CENTERED_TOO_FAR_TOP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_CENTERED_TOO_FAR_BOTTOM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_CENTERED_TOO_FAR_LEFT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_CENTERED_TOO_FAR_RIGHT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_ROTATED_TOO_FAR_LEFT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_ROTATED_TOO_FAR_RIGHT.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                e[com.facetec.sdk.cl.MOVE_PHONE_TO_EYE_LEVEL.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_LOOKING_TOO_FAR_LEFT.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_LOOKING_TOO_FAR_RIGHT.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                e[com.facetec.sdk.cl.FACE_NOT_LOOKING_STRAIGHT_AHEAD.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                e[com.facetec.sdk.cl.USE_EVEN_LIGHTING.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            int[] iArr2 = new int[com.facetec.sdk.ct.values().length];
            b = iArr2;
            try {
                iArr2[com.facetec.sdk.ct.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                b[com.facetec.sdk.ct.FRAME_YOUR_FACE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                b[com.facetec.sdk.ct.WEARING_SUNGLASSES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                b[com.facetec.sdk.ct.BAD_POSE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                b[com.facetec.sdk.ct.TOO_BRIGHT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                b[com.facetec.sdk.ct.TOO_DARK.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                b[com.facetec.sdk.ct.MAKING_FACE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                b[com.facetec.sdk.ct.HOLD_STEADY_3.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                b[com.facetec.sdk.ct.HOLD_STEADY_2.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                b[com.facetec.sdk.ct.HOLD_STEADY_1.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                b[com.facetec.sdk.ct.MOVE_CLOSER.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                b[com.facetec.sdk.ct.MOVE_AWAY.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
        }
    }
}
