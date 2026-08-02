package androidx.view.provider.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/provider/utils/BeginGetCredentialUtil;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BeginGetCredentialUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.utils.BeginGetCredentialUtil.Companion INSTANCE = new androidx.view.provider.utils.BeginGetCredentialUtil.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion;", "", "<init>", "()V", "Landroid/service/credentials/BeginGetCredentialRequest;", "request", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "convertToJetpackRequest$credentials_release", "(Landroid/service/credentials/BeginGetCredentialRequest;)Landroidx/credentials/provider/BeginGetCredentialRequest;", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "response", "Landroid/service/credentials/BeginGetCredentialResponse;", "convertToFrameworkResponse", "(Landroidx/credentials/provider/BeginGetCredentialResponse;)Landroid/service/credentials/BeginGetCredentialResponse;", "convertToFrameworkRequest", "(Landroidx/credentials/provider/BeginGetCredentialRequest;)Landroid/service/credentials/BeginGetCredentialRequest;", "convertToJetpackResponse", "(Landroid/service/credentials/BeginGetCredentialResponse;)Landroidx/credentials/provider/BeginGetCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ boolean $r8$lambda$FJtNRK5BIwjbomp68vl5bH7sOCY(androidx.view.provider.AuthenticationAction authenticationAction) {
            return authenticationAction != null;
        }

        /* renamed from: $r8$lambda$Qp-jfD-ulurCtemlpM_oMc4q7k8, reason: not valid java name */
        public static /* synthetic */ boolean m9136$r8$lambda$QpjfDulurCtemlpM_oMc4q7k8(androidx.view.provider.Action action) {
            return action != null;
        }

        /* renamed from: $r8$lambda$efi3hr-BAqFBKL69ODJlyVzw0h8, reason: not valid java name */
        public static /* synthetic */ boolean m9138$r8$lambda$efi3hrBAqFBKL69ODJlyVzw0h8(androidx.view.provider.CredentialEntry credentialEntry) {
            return credentialEntry != null;
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetCredentialRequest convertToJetpackRequest$credentials_release(android.service.credentials.BeginGetCredentialRequest request) {
            androidx.view.provider.CallingAppInfo callingAppInfo;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<android.service.credentials.BeginGetCredentialOption> beginGetCredentialOptions = request.getBeginGetCredentialOptions();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(beginGetCredentialOptions, "");
            for (android.service.credentials.BeginGetCredentialOption beginGetCredentialOption : beginGetCredentialOptions) {
                androidx.view.provider.BeginGetCredentialOption.Companion companion = androidx.view.provider.BeginGetCredentialOption.INSTANCE;
                java.lang.String id = beginGetCredentialOption.getId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
                java.lang.String type = beginGetCredentialOption.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                android.os.Bundle candidateQueryData = beginGetCredentialOption.getCandidateQueryData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(candidateQueryData, "");
                arrayList.add(companion.createFrom$credentials_release(id, type, candidateQueryData));
            }
            android.service.credentials.CallingAppInfo callingAppInfo2 = request.getCallingAppInfo();
            if (callingAppInfo2 != null) {
                androidx.view.provider.CallingAppInfo.Companion companion2 = androidx.view.provider.CallingAppInfo.INSTANCE;
                java.lang.String packageName = callingAppInfo2.getPackageName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
                android.content.pm.SigningInfo signingInfo = callingAppInfo2.getSigningInfo();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signingInfo, "");
                callingAppInfo = companion2.create(packageName, signingInfo, callingAppInfo2.getOrigin());
            } else {
                callingAppInfo = null;
            }
            return new androidx.view.provider.BeginGetCredentialRequest(arrayList, callingAppInfo);
        }

        public final android.service.credentials.BeginGetCredentialResponse convertToFrameworkResponse(androidx.view.provider.BeginGetCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            android.service.credentials.BeginGetCredentialResponse.Builder builder = new android.service.credentials.BeginGetCredentialResponse.Builder();
            for (androidx.view.provider.CredentialEntry credentialEntry : response.getCredentialEntries()) {
                android.app.slice.Slice slice$credentials_release = androidx.view.provider.CredentialEntry.INSTANCE.toSlice$credentials_release(credentialEntry);
                if (slice$credentials_release != null) {
                    builder.addCredentialEntry(new android.service.credentials.CredentialEntry(new android.service.credentials.BeginGetCredentialOption(credentialEntry.getBeginGetCredentialOption().getId(), credentialEntry.getType(), android.os.Bundle.EMPTY), slice$credentials_release));
                }
            }
            java.util.Iterator<T> it = response.getActions().iterator();
            while (it.hasNext()) {
                builder.addAction(new android.service.credentials.Action(androidx.view.provider.Action.INSTANCE.toSlice((androidx.view.provider.Action) it.next())));
            }
            java.util.Iterator<T> it2 = response.getAuthenticationActions().iterator();
            while (it2.hasNext()) {
                builder.addAuthenticationAction(new android.service.credentials.Action(androidx.view.provider.AuthenticationAction.INSTANCE.toSlice((androidx.view.provider.AuthenticationAction) it2.next())));
            }
            androidx.view.provider.RemoteEntry remoteEntry = response.getRemoteEntry();
            if (remoteEntry != null) {
                builder.setRemoteCredentialEntry(new android.service.credentials.RemoteEntry(androidx.view.provider.RemoteEntry.INSTANCE.toSlice(remoteEntry)));
            }
            android.service.credentials.BeginGetCredentialResponse build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public final android.service.credentials.BeginGetCredentialRequest convertToFrameworkRequest(androidx.view.provider.BeginGetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            android.service.credentials.BeginGetCredentialRequest.Builder builder = new android.service.credentials.BeginGetCredentialRequest.Builder();
            if (request.getCallingAppInfo() != null) {
                builder.setCallingAppInfo(new android.service.credentials.CallingAppInfo(request.getCallingAppInfo().getPackageName(), request.getCallingAppInfo().getSigningInfo(), request.getCallingAppInfo().getOrigin()));
            }
            java.util.stream.Stream<androidx.view.provider.BeginGetCredentialOption> stream = request.getBeginGetCredentialOptions().stream();
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.m9135$r8$lambda$F4sUj4LEa9qww18Py3wPOG6Y7w((androidx.view.provider.BeginGetCredentialOption) obj);
                }
            };
            android.service.credentials.BeginGetCredentialRequest build = builder.setBeginGetCredentialOptions((java.util.List) stream.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda10
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$L3ppGGz259ZEqVtXk3peoMzt8AY(kotlin.jvm.functions.Function1.this, obj);
                }
            }).collect(java.util.stream.Collectors.toList())).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public final androidx.view.provider.BeginGetCredentialResponse convertToJetpackResponse(android.service.credentials.BeginGetCredentialResponse response) {
            androidx.view.provider.RemoteEntry remoteEntry;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            java.util.stream.Stream<android.service.credentials.CredentialEntry> stream = response.getCredentialEntries().stream();
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$U3ivO9n14ZsI08v49hFWedqgHbc((android.service.credentials.CredentialEntry) obj);
                }
            };
            java.util.stream.Stream<R> map = stream.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda19
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$FjLMTEKqAf5eiT1I0gyTL67AuZE(kotlin.jvm.functions.Function1.this, obj);
                }
            });
            final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.view.provider.utils.BeginGetCredentialUtil.Companion.m9138$r8$lambda$efi3hrBAqFBKL69ODJlyVzw0h8((androidx.view.provider.CredentialEntry) obj));
                }
            };
            java.util.stream.Stream filter = map.filter(new java.util.function.Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda2
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean booleanValue;
                    booleanValue = ((java.lang.Boolean) kotlin.jvm.functions.Function1.this.invoke(obj)).booleanValue();
                    return booleanValue;
                }
            });
            final kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$1U8EsKVpl3jE1aSs_zukLQZcAdY((androidx.view.provider.CredentialEntry) obj);
                }
            };
            java.lang.Object collect = filter.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda4
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.m9139$r8$lambda$jXTXHmEuMSrGmEyDQsxAALStK4(kotlin.jvm.functions.Function1.this, obj);
                }
            }).collect(java.util.stream.Collectors.toList());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collect, "");
            java.util.List list = (java.util.List) collect;
            java.util.stream.Stream<android.service.credentials.Action> stream2 = response.getActions().stream();
            final kotlin.jvm.functions.Function1 function14 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$cQ3TEaO_GNgljsZim89bXIHIYVM((android.service.credentials.Action) obj);
                }
            };
            java.util.stream.Stream<R> map2 = stream2.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda6
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.m9141$r8$lambda$sVQLOzQX4Z0eCu_jAZbaxizZ_I(kotlin.jvm.functions.Function1.this, obj);
                }
            });
            final kotlin.jvm.functions.Function1 function15 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.view.provider.utils.BeginGetCredentialUtil.Companion.m9136$r8$lambda$QpjfDulurCtemlpM_oMc4q7k8((androidx.view.provider.Action) obj));
                }
            };
            java.util.stream.Stream filter2 = map2.filter(new java.util.function.Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda8
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean booleanValue;
                    booleanValue = ((java.lang.Boolean) kotlin.jvm.functions.Function1.this.invoke(obj)).booleanValue();
                    return booleanValue;
                }
            });
            final kotlin.jvm.functions.Function1 function16 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$HtOKU_gf_Q4SNbg2CcTgRZgKhC4((androidx.view.provider.Action) obj);
                }
            };
            java.lang.Object collect2 = filter2.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda12
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$2hVthQDxaeJa2oe6a6vEaFNqSR8(kotlin.jvm.functions.Function1.this, obj);
                }
            }).collect(java.util.stream.Collectors.toList());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collect2, "");
            java.util.List list2 = (java.util.List) collect2;
            java.util.stream.Stream<android.service.credentials.Action> stream3 = response.getAuthenticationActions().stream();
            final kotlin.jvm.functions.Function1 function17 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$XMHtFFhlR193GPyXOScDeA1mQ38((android.service.credentials.Action) obj);
                }
            };
            java.util.stream.Stream<R> map3 = stream3.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda14
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.m9140$r8$lambda$oKrQFxNnfd7ccYkZQ5ciAhCToM(kotlin.jvm.functions.Function1.this, obj);
                }
            });
            final kotlin.jvm.functions.Function1 function18 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$FJtNRK5BIwjbomp68vl5bH7sOCY((androidx.view.provider.AuthenticationAction) obj));
                }
            };
            java.util.stream.Stream filter3 = map3.filter(new java.util.function.Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda16
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean booleanValue;
                    booleanValue = ((java.lang.Boolean) kotlin.jvm.functions.Function1.this.invoke(obj)).booleanValue();
                    return booleanValue;
                }
            });
            final kotlin.jvm.functions.Function1 function19 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.m9137$r8$lambda$cY41Nd3Gu6rOYRen8QMjU5OwuU((androidx.view.provider.AuthenticationAction) obj);
                }
            };
            java.lang.Object collect3 = filter3.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda18
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginGetCredentialUtil.Companion.$r8$lambda$cIIwnNgurRxXK2s0nguRfqua_9Q(kotlin.jvm.functions.Function1.this, obj);
                }
            }).collect(java.util.stream.Collectors.toList());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collect3, "");
            java.util.List list3 = (java.util.List) collect3;
            android.service.credentials.RemoteEntry remoteCredentialEntry = response.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                androidx.view.provider.RemoteEntry.Companion companion = androidx.view.provider.RemoteEntry.INSTANCE;
                android.app.slice.Slice slice = remoteCredentialEntry.getSlice();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
                remoteEntry = companion.fromSlice(slice);
            } else {
                remoteEntry = null;
            }
            return new androidx.view.provider.BeginGetCredentialResponse(list, list2, list3, remoteEntry);
        }

        public static /* synthetic */ androidx.view.provider.CredentialEntry $r8$lambda$1U8EsKVpl3jE1aSs_zukLQZcAdY(androidx.view.provider.CredentialEntry credentialEntry) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(credentialEntry);
            return credentialEntry;
        }

        public static /* synthetic */ androidx.view.provider.Action $r8$lambda$2hVthQDxaeJa2oe6a6vEaFNqSR8(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.view.provider.Action) function1.invoke(obj);
        }

        /* renamed from: $r8$lambda$F4sUj4LEa-9qww18Py3wPOG6Y7w, reason: not valid java name */
        public static /* synthetic */ android.service.credentials.BeginGetCredentialOption m9135$r8$lambda$F4sUj4LEa9qww18Py3wPOG6Y7w(androidx.view.provider.BeginGetCredentialOption beginGetCredentialOption) {
            androidx.view.provider.utils.BeginGetCredentialUtil.Companion companion = androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(beginGetCredentialOption);
            return new android.service.credentials.BeginGetCredentialOption(beginGetCredentialOption.getId(), beginGetCredentialOption.getType(), beginGetCredentialOption.getCandidateQueryData());
        }

        public static /* synthetic */ androidx.view.provider.CredentialEntry $r8$lambda$FjLMTEKqAf5eiT1I0gyTL67AuZE(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.view.provider.CredentialEntry) function1.invoke(obj);
        }

        public static /* synthetic */ androidx.view.provider.Action $r8$lambda$HtOKU_gf_Q4SNbg2CcTgRZgKhC4(androidx.view.provider.Action action) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(action);
            return action;
        }

        public static /* synthetic */ android.service.credentials.BeginGetCredentialOption $r8$lambda$L3ppGGz259ZEqVtXk3peoMzt8AY(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (android.service.credentials.BeginGetCredentialOption) function1.invoke(obj);
        }

        public static /* synthetic */ androidx.view.provider.CredentialEntry $r8$lambda$U3ivO9n14ZsI08v49hFWedqgHbc(android.service.credentials.CredentialEntry credentialEntry) {
            androidx.view.provider.CredentialEntry.Companion companion = androidx.view.provider.CredentialEntry.INSTANCE;
            android.app.slice.Slice slice = credentialEntry.getSlice();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
            return companion.fromSlice$credentials_release(slice);
        }

        public static /* synthetic */ androidx.view.provider.AuthenticationAction $r8$lambda$XMHtFFhlR193GPyXOScDeA1mQ38(android.service.credentials.Action action) {
            androidx.view.provider.AuthenticationAction.Companion companion = androidx.view.provider.AuthenticationAction.INSTANCE;
            android.app.slice.Slice slice = action.getSlice();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
            return companion.fromSlice(slice);
        }

        public static /* synthetic */ androidx.view.provider.AuthenticationAction $r8$lambda$cIIwnNgurRxXK2s0nguRfqua_9Q(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.view.provider.AuthenticationAction) function1.invoke(obj);
        }

        public static /* synthetic */ androidx.view.provider.Action $r8$lambda$cQ3TEaO_GNgljsZim89bXIHIYVM(android.service.credentials.Action action) {
            androidx.view.provider.Action.Companion companion = androidx.view.provider.Action.INSTANCE;
            android.app.slice.Slice slice = action.getSlice();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
            return companion.fromSlice(slice);
        }

        /* renamed from: $r8$lambda$cY4-1Nd3Gu6rOYRen8QMjU5OwuU, reason: not valid java name */
        public static /* synthetic */ androidx.view.provider.AuthenticationAction m9137$r8$lambda$cY41Nd3Gu6rOYRen8QMjU5OwuU(androidx.view.provider.AuthenticationAction authenticationAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(authenticationAction);
            return authenticationAction;
        }

        /* renamed from: $r8$lambda$jXTXHmEuMSrGmEyDQsx-AALStK4, reason: not valid java name */
        public static /* synthetic */ androidx.view.provider.CredentialEntry m9139$r8$lambda$jXTXHmEuMSrGmEyDQsxAALStK4(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.view.provider.CredentialEntry) function1.invoke(obj);
        }

        /* renamed from: $r8$lambda$oKrQFxNnf-d7ccYkZQ5ciAhCToM, reason: not valid java name */
        public static /* synthetic */ androidx.view.provider.AuthenticationAction m9140$r8$lambda$oKrQFxNnfd7ccYkZQ5ciAhCToM(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.view.provider.AuthenticationAction) function1.invoke(obj);
        }

        /* renamed from: $r8$lambda$sVQ-LOzQX4Z0eCu_jAZbaxizZ_I, reason: not valid java name */
        public static /* synthetic */ androidx.view.provider.Action m9141$r8$lambda$sVQLOzQX4Z0eCu_jAZbaxizZ_I(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.view.provider.Action) function1.invoke(obj);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
