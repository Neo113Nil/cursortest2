package com.inmobi.media;

/* renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2625nl extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5361a;
    public final /* synthetic */ android.content.Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2625nl(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2625nl(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2625nl(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0050, code lost:
    
        if (com.inmobi.media.C2624nk.b(r18) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0047, code lost:
    
        if (r2 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        android.content.Context context;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        int i;
        java.lang.String string5;
        java.lang.String string6;
        java.lang.String string7;
        java.lang.String string8;
        java.lang.String string9;
        java.lang.String string10;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f5361a;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("pl", "access$getTAG$p(...)");
            if (com.inmobi.media.C2678pl.b) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("pl", "access$getTAG$p(...)");
                return kotlin.Unit.INSTANCE;
            }
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            this.f5361a = 1;
            java.lang.Object b = com.inmobi.media.AbstractC2318c4.f5134a.b(this);
            if (b != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                b = kotlin.Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.Qk.a();
                com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = com.inmobi.media.B1.f4611a;
                java.lang.String str2 = com.inmobi.media.B8.f4617a;
                com.inmobi.media.B5 b5 = com.inmobi.media.B5.f4614a;
                b5.getClass();
                com.inmobi.media.B5.h();
                com.inmobi.media.B5.q();
                ((java.lang.Boolean) com.inmobi.media.B5.q.getValue()).getClass();
                ((java.lang.Number) com.inmobi.media.B5.f.getValue(b5, com.inmobi.media.B5.b[0])).intValue();
                int i3 = com.inmobi.media.AbstractC2332ch.f5142a;
                android.content.Context context2 = com.inmobi.media.Xi.f5051a;
                if (i3 != Integer.MIN_VALUE) {
                    com.inmobi.media.AbstractC2332ch.f5142a = i3;
                    if (context2 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context2, "user_info_store").a("user_age", i3, false);
                    }
                }
                java.lang.String str3 = com.inmobi.media.AbstractC2332ch.c;
                android.content.Context context3 = com.inmobi.media.Xi.f5051a;
                if (str3 != null) {
                    com.inmobi.media.AbstractC2332ch.c = str3;
                    if (context3 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context3, "user_info_store").a("user_age_group", str3, false);
                    }
                }
                java.lang.String str4 = com.inmobi.media.AbstractC2332ch.d;
                android.content.Context context4 = com.inmobi.media.Xi.f5051a;
                com.inmobi.media.AbstractC2332ch.d = str4;
                if (context4 != null && str4 != null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = com.inmobi.media.La.b;
                    com.inmobi.media.Ka.a(context4, "user_info_store").a("user_area_code", str4, false);
                }
                java.lang.String str5 = com.inmobi.media.AbstractC2332ch.e;
                android.content.Context context5 = com.inmobi.media.Xi.f5051a;
                if (str5 != null) {
                    com.inmobi.media.AbstractC2332ch.e = str5;
                    if (context5 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap4 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context5, "user_info_store").a("user_post_code", str5, false);
                    }
                }
                java.lang.String str6 = com.inmobi.media.AbstractC2332ch.f;
                android.content.Context context6 = com.inmobi.media.Xi.f5051a;
                if (str6 != null) {
                    com.inmobi.media.AbstractC2332ch.f = str6;
                    if (context6 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap5 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context6, "user_info_store").a("user_city_code", str6, false);
                    }
                }
                java.lang.String str7 = com.inmobi.media.AbstractC2332ch.g;
                android.content.Context context7 = com.inmobi.media.Xi.f5051a;
                if (str7 != null) {
                    com.inmobi.media.AbstractC2332ch.g = str7;
                    if (context7 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap6 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context7, "user_info_store").a("user_state_code", str7, false);
                    }
                }
                java.lang.String str8 = com.inmobi.media.AbstractC2332ch.h;
                android.content.Context context8 = com.inmobi.media.Xi.f5051a;
                if (str8 != null) {
                    com.inmobi.media.AbstractC2332ch.h = str8;
                    if (context8 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap7 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context8, "user_info_store").a("user_country_code", str8, false);
                    }
                }
                int i4 = com.inmobi.media.AbstractC2332ch.i;
                android.content.Context context9 = com.inmobi.media.Xi.f5051a;
                if (i4 != Integer.MIN_VALUE) {
                    com.inmobi.media.AbstractC2332ch.i = i4;
                    if (context9 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap8 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context9, "user_info_store").a("user_yob", i4, false);
                    }
                }
                java.lang.String str9 = com.inmobi.media.AbstractC2332ch.j;
                android.content.Context context10 = com.inmobi.media.Xi.f5051a;
                if (str9 != null) {
                    com.inmobi.media.AbstractC2332ch.j = str9;
                    if (context10 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap9 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context10, "user_info_store").a(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_GENDER, str9, false);
                    }
                }
                java.lang.String str10 = com.inmobi.media.AbstractC2332ch.k;
                android.content.Context context11 = com.inmobi.media.Xi.f5051a;
                if (str10 != null) {
                    com.inmobi.media.AbstractC2332ch.k = str10;
                    if (context11 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap10 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context11, "user_info_store").a("user_education", str10, false);
                    }
                }
                java.lang.String str11 = com.inmobi.media.AbstractC2332ch.l;
                android.content.Context context12 = com.inmobi.media.Xi.f5051a;
                if (str11 != null) {
                    com.inmobi.media.AbstractC2332ch.l = str11;
                    if (context12 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap11 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context12, "user_info_store").a("user_language", str11, false);
                    }
                }
                java.lang.String str12 = com.inmobi.media.AbstractC2332ch.m;
                android.content.Context context13 = com.inmobi.media.Xi.f5051a;
                if (str12 != null) {
                    com.inmobi.media.AbstractC2332ch.m = str12;
                    if (context13 != null) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap12 = com.inmobi.media.La.b;
                        com.inmobi.media.Ka.a(context13, "user_info_store").a("user_interest", str12, false);
                    }
                }
                android.location.Location location = com.inmobi.media.AbstractC2332ch.n;
                android.content.Context context14 = com.inmobi.media.Xi.f5051a;
                if (location != null) {
                    com.inmobi.media.AbstractC2332ch.n = location;
                    if (context14 != null) {
                        java.lang.String a2 = com.inmobi.media.AbstractC2332ch.a(location);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap13 = com.inmobi.media.La.b;
                        str = "user_interest";
                        com.inmobi.media.Ka.a(context14, "user_info_store").a(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, a2, false);
                        int i5 = Integer.MIN_VALUE;
                        if (com.inmobi.media.AbstractC2332ch.f5142a == Integer.MIN_VALUE) {
                            android.content.Context context15 = com.inmobi.media.Xi.f5051a;
                            if (context15 != null) {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap14 = com.inmobi.media.La.b;
                                com.inmobi.media.La a3 = com.inmobi.media.Ka.a(context15, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age", com.ironsource.X3.i.W);
                                i5 = a3.f4815a.getInt("user_age", Integer.MIN_VALUE);
                            }
                            com.inmobi.media.AbstractC2332ch.f5142a = i5;
                        }
                        if (com.inmobi.media.AbstractC2332ch.c == null) {
                            android.content.Context context16 = com.inmobi.media.Xi.f5051a;
                            if (context16 == null) {
                                string10 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap15 = com.inmobi.media.La.b;
                                com.inmobi.media.La a4 = com.inmobi.media.Ka.a(context16, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_group", com.ironsource.X3.i.W);
                                string10 = a4.f4815a.getString("user_age_group", null);
                            }
                            com.inmobi.media.AbstractC2332ch.c = string10;
                        }
                        if (com.inmobi.media.AbstractC2332ch.d == null) {
                            android.content.Context context17 = com.inmobi.media.Xi.f5051a;
                            if (context17 == null) {
                                string9 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap16 = com.inmobi.media.La.b;
                                com.inmobi.media.La a5 = com.inmobi.media.Ka.a(context17, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_area_code", com.ironsource.X3.i.W);
                                string9 = a5.f4815a.getString("user_area_code", null);
                            }
                            com.inmobi.media.AbstractC2332ch.d = string9;
                        }
                        if (com.inmobi.media.AbstractC2332ch.e == null) {
                            android.content.Context context18 = com.inmobi.media.Xi.f5051a;
                            if (context18 == null) {
                                string8 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap17 = com.inmobi.media.La.b;
                                com.inmobi.media.La a6 = com.inmobi.media.Ka.a(context18, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_post_code", com.ironsource.X3.i.W);
                                string8 = a6.f4815a.getString("user_post_code", null);
                            }
                            com.inmobi.media.AbstractC2332ch.e = string8;
                        }
                        if (com.inmobi.media.AbstractC2332ch.f == null) {
                            android.content.Context context19 = com.inmobi.media.Xi.f5051a;
                            if (context19 == null) {
                                string7 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap18 = com.inmobi.media.La.b;
                                com.inmobi.media.La a7 = com.inmobi.media.Ka.a(context19, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_city_code", com.ironsource.X3.i.W);
                                string7 = a7.f4815a.getString("user_city_code", null);
                            }
                            com.inmobi.media.AbstractC2332ch.f = string7;
                        }
                        if (com.inmobi.media.AbstractC2332ch.g == null) {
                            android.content.Context context20 = com.inmobi.media.Xi.f5051a;
                            if (context20 == null) {
                                string6 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap19 = com.inmobi.media.La.b;
                                com.inmobi.media.La a8 = com.inmobi.media.Ka.a(context20, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_state_code", com.ironsource.X3.i.W);
                                string6 = a8.f4815a.getString("user_state_code", null);
                            }
                            com.inmobi.media.AbstractC2332ch.g = string6;
                        }
                        if (com.inmobi.media.AbstractC2332ch.h == null) {
                            android.content.Context context21 = com.inmobi.media.Xi.f5051a;
                            if (context21 == null) {
                                string5 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap20 = com.inmobi.media.La.b;
                                com.inmobi.media.La a9 = com.inmobi.media.Ka.a(context21, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_country_code", com.ironsource.X3.i.W);
                                string5 = a9.f4815a.getString("user_country_code", null);
                            }
                            com.inmobi.media.AbstractC2332ch.h = string5;
                        }
                        if (com.inmobi.media.AbstractC2332ch.i == Integer.MIN_VALUE) {
                            android.content.Context context22 = com.inmobi.media.Xi.f5051a;
                            if (context22 == null) {
                                i = Integer.MIN_VALUE;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap21 = com.inmobi.media.La.b;
                                com.inmobi.media.La a10 = com.inmobi.media.Ka.a(context22, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_yob", com.ironsource.X3.i.W);
                                i = a10.f4815a.getInt("user_yob", Integer.MIN_VALUE);
                            }
                            com.inmobi.media.AbstractC2332ch.i = i;
                        }
                        if (com.inmobi.media.AbstractC2332ch.j == null) {
                            android.content.Context context23 = com.inmobi.media.Xi.f5051a;
                            if (context23 == null) {
                                string4 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap22 = com.inmobi.media.La.b;
                                com.inmobi.media.La a11 = com.inmobi.media.Ka.a(context23, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_GENDER, com.ironsource.X3.i.W);
                                string4 = a11.f4815a.getString(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_GENDER, null);
                            }
                            com.inmobi.media.AbstractC2332ch.j = string4;
                        }
                        if (com.inmobi.media.AbstractC2332ch.k == null) {
                            android.content.Context context24 = com.inmobi.media.Xi.f5051a;
                            if (context24 == null) {
                                string3 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap23 = com.inmobi.media.La.b;
                                com.inmobi.media.La a12 = com.inmobi.media.Ka.a(context24, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_education", com.ironsource.X3.i.W);
                                string3 = a12.f4815a.getString("user_education", null);
                            }
                            com.inmobi.media.AbstractC2332ch.k = string3;
                        }
                        if (com.inmobi.media.AbstractC2332ch.l == null) {
                            android.content.Context context25 = com.inmobi.media.Xi.f5051a;
                            if (context25 == null) {
                                string2 = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap24 = com.inmobi.media.La.b;
                                com.inmobi.media.La a13 = com.inmobi.media.Ka.a(context25, "user_info_store");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_language", com.ironsource.X3.i.W);
                                string2 = a13.f4815a.getString("user_language", null);
                            }
                            com.inmobi.media.AbstractC2332ch.l = string2;
                        }
                        if (com.inmobi.media.AbstractC2332ch.m == null) {
                            android.content.Context context26 = com.inmobi.media.Xi.f5051a;
                            if (context26 == null) {
                                string = null;
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap25 = com.inmobi.media.La.b;
                                com.inmobi.media.La a14 = com.inmobi.media.Ka.a(context26, "user_info_store");
                                java.lang.String key = str;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                                string = a14.f4815a.getString(key, null);
                            }
                            com.inmobi.media.AbstractC2332ch.m = string;
                        }
                        com.inmobi.media.AbstractC2332ch.b();
                        if (com.inmobi.media.AbstractC2332ch.b == null && (context = com.inmobi.media.Xi.f5051a) != null) {
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap26 = com.inmobi.media.La.b;
                            com.inmobi.media.La a15 = com.inmobi.media.Ka.a(context, "user_info_store");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                            com.inmobi.media.AbstractC2332ch.b = java.lang.Boolean.valueOf(a15.f4815a.getBoolean("user_age_restricted", false));
                        }
                        com.inmobi.media.C2597ml runnable = new com.inmobi.media.C2597ml(this.b, null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.Xi.h, null, null, new com.inmobi.media.Wi(runnable, null), 3, null);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                str = "user_interest";
                int i52 = Integer.MIN_VALUE;
                if (com.inmobi.media.AbstractC2332ch.f5142a == Integer.MIN_VALUE) {
                }
                if (com.inmobi.media.AbstractC2332ch.c == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.d == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.e == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.f == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.g == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.h == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.i == Integer.MIN_VALUE) {
                }
                if (com.inmobi.media.AbstractC2332ch.j == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.k == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.l == null) {
                }
                if (com.inmobi.media.AbstractC2332ch.m == null) {
                }
                com.inmobi.media.AbstractC2332ch.b();
                if (com.inmobi.media.AbstractC2332ch.b == null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap262 = com.inmobi.media.La.b;
                    com.inmobi.media.La a152 = com.inmobi.media.Ka.a(context, "user_info_store");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                    com.inmobi.media.AbstractC2332ch.b = java.lang.Boolean.valueOf(a152.f4815a.getBoolean("user_age_restricted", false));
                }
                com.inmobi.media.C2597ml runnable2 = new com.inmobi.media.C2597ml(this.b, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable2, "runnable");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.Xi.h, null, null, new com.inmobi.media.Wi(runnable2, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f5361a = 2;
    }
}
