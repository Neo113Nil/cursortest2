package androidx.view.provider.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/provider/utils/BeginCreateCredentialUtil;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BeginCreateCredentialUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.utils.BeginCreateCredentialUtil.Companion INSTANCE = new androidx.view.provider.utils.BeginCreateCredentialUtil.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion;", "", "<init>", "()V", "Landroid/service/credentials/BeginCreateCredentialRequest;", "request", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "convertToJetpackRequest$credentials_release", "(Landroid/service/credentials/BeginCreateCredentialRequest;)Landroidx/credentials/provider/BeginCreateCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "response", "Landroid/service/credentials/BeginCreateCredentialResponse;", "convertToFrameworkResponse", "(Landroidx/credentials/provider/BeginCreateCredentialResponse;)Landroid/service/credentials/BeginCreateCredentialResponse;", "convertToFrameworkRequest", "(Landroidx/credentials/provider/BeginCreateCredentialRequest;)Landroid/service/credentials/BeginCreateCredentialRequest;", "frameworkResponse", "convertToJetpackResponse", "(Landroid/service/credentials/BeginCreateCredentialResponse;)Landroidx/credentials/provider/BeginCreateCredentialResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: $r8$lambda$hPZ3WEYwOrWb5-c4iEE0D9jWtT4, reason: not valid java name */
        public static /* synthetic */ boolean m9133$r8$lambda$hPZ3WEYwOrWb5c4iEE0D9jWtT4(androidx.view.provider.CreateEntry createEntry) {
            return createEntry != null;
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginCreateCredentialRequest convertToJetpackRequest$credentials_release(android.service.credentials.BeginCreateCredentialRequest request) {
            androidx.view.provider.CallingAppInfo callingAppInfo;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            androidx.view.provider.BeginCreateCredentialRequest.Companion companion = androidx.view.provider.BeginCreateCredentialRequest.INSTANCE;
            java.lang.String type = request.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            android.os.Bundle data = request.getData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
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
            return companion.createFrom(type, data, callingAppInfo);
        }

        public final android.service.credentials.BeginCreateCredentialResponse convertToFrameworkResponse(androidx.view.provider.BeginCreateCredentialResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            android.service.credentials.BeginCreateCredentialResponse.Builder builder = new android.service.credentials.BeginCreateCredentialResponse.Builder();
            java.util.Iterator<T> it = response.getCreateEntries().iterator();
            while (it.hasNext()) {
                android.app.slice.Slice slice = androidx.view.provider.CreateEntry.INSTANCE.toSlice((androidx.view.provider.CreateEntry) it.next());
                if (slice != null) {
                    builder.addCreateEntry(new android.service.credentials.CreateEntry(slice));
                }
            }
            androidx.view.provider.RemoteEntry remoteEntry = response.getRemoteEntry();
            if (remoteEntry != null) {
                builder.setRemoteCreateEntry(new android.service.credentials.RemoteEntry(androidx.view.provider.RemoteEntry.INSTANCE.toSlice(remoteEntry)));
            }
            android.service.credentials.BeginCreateCredentialResponse build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public final android.service.credentials.BeginCreateCredentialRequest convertToFrameworkRequest(androidx.view.provider.BeginCreateCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            return new android.service.credentials.BeginCreateCredentialRequest(request.getType(), request.getCandidateQueryData(), request.getCallingAppInfo() != null ? new android.service.credentials.CallingAppInfo(request.getCallingAppInfo().getPackageName(), request.getCallingAppInfo().getSigningInfo(), request.getCallingAppInfo().getOrigin()) : null);
        }

        public final androidx.view.provider.BeginCreateCredentialResponse convertToJetpackResponse(android.service.credentials.BeginCreateCredentialResponse frameworkResponse) {
            androidx.view.provider.RemoteEntry remoteEntry;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameworkResponse, "");
            java.util.stream.Stream<android.service.credentials.CreateEntry> stream = frameworkResponse.getCreateEntries().stream();
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginCreateCredentialUtil.Companion.m9131$r8$lambda$V05uslOwpOgz3BE6hmV4mdhZmY((android.service.credentials.CreateEntry) obj);
                }
            };
            java.util.stream.Stream<R> map = stream.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginCreateCredentialUtil.Companion.m9132$r8$lambda$akJGXeEMRwnhJ3EK6S6_O6JWZU(kotlin.jvm.functions.Function1.this, obj);
                }
            });
            final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.view.provider.utils.BeginCreateCredentialUtil.Companion.m9133$r8$lambda$hPZ3WEYwOrWb5c4iEE0D9jWtT4((androidx.view.provider.CreateEntry) obj));
                }
            };
            java.util.stream.Stream filter = map.filter(new java.util.function.Predicate() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda3
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    boolean booleanValue;
                    booleanValue = ((java.lang.Boolean) kotlin.jvm.functions.Function1.this.invoke(obj)).booleanValue();
                    return booleanValue;
                }
            });
            final kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginCreateCredentialUtil.Companion.$r8$lambda$hziEOpbGGA5axMvR2zQBgD3cHtw((androidx.view.provider.CreateEntry) obj);
                }
            };
            java.lang.Object collect = filter.map(new java.util.function.Function() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$$ExternalSyntheticLambda5
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.view.provider.utils.BeginCreateCredentialUtil.Companion.$r8$lambda$jncUr8kivnMDy8_VGRmBkvp9FvU(kotlin.jvm.functions.Function1.this, obj);
                }
            }).collect(java.util.stream.Collectors.toList());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collect, "");
            java.util.List list = (java.util.List) collect;
            android.service.credentials.RemoteEntry remoteCreateEntry = frameworkResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                androidx.view.provider.RemoteEntry.Companion companion = androidx.view.provider.RemoteEntry.INSTANCE;
                android.app.slice.Slice slice = remoteCreateEntry.getSlice();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
                remoteEntry = companion.fromSlice(slice);
            } else {
                remoteEntry = null;
            }
            return new androidx.view.provider.BeginCreateCredentialResponse(list, remoteEntry);
        }

        /* renamed from: $r8$lambda$V0-5uslOwpOgz3BE6hmV4mdhZmY, reason: not valid java name */
        public static /* synthetic */ androidx.view.provider.CreateEntry m9131$r8$lambda$V05uslOwpOgz3BE6hmV4mdhZmY(android.service.credentials.CreateEntry createEntry) {
            androidx.view.provider.CreateEntry.Companion companion = androidx.view.provider.CreateEntry.INSTANCE;
            android.app.slice.Slice slice = createEntry.getSlice();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(slice, "");
            return companion.fromSlice(slice);
        }

        /* renamed from: $r8$lambda$akJGXeEMRwnhJ-3EK6S6_O6JWZU, reason: not valid java name */
        public static /* synthetic */ androidx.view.provider.CreateEntry m9132$r8$lambda$akJGXeEMRwnhJ3EK6S6_O6JWZU(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.view.provider.CreateEntry) function1.invoke(obj);
        }

        public static /* synthetic */ androidx.view.provider.CreateEntry $r8$lambda$hziEOpbGGA5axMvR2zQBgD3cHtw(androidx.view.provider.CreateEntry createEntry) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(createEntry);
            return createEntry;
        }

        public static /* synthetic */ androidx.view.provider.CreateEntry $r8$lambda$jncUr8kivnMDy8_VGRmBkvp9FvU(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return (androidx.view.provider.CreateEntry) function1.invoke(obj);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
