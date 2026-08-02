package androidx.browser.trusted;

/* loaded from: classes6.dex */
public final class TrustedWebActivityServiceConnectionPool {
    private final android.content.Context Camera2StreamConfigurationMap;
    final java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

    private TrustedWebActivityServiceConnectionPool(android.content.Context context) {
        this.Camera2StreamConfigurationMap = context.getApplicationContext();
    }

    public static androidx.browser.trusted.TrustedWebActivityServiceConnectionPool create(android.content.Context context) {
        return new androidx.browser.trusted.TrustedWebActivityServiceConnectionPool(context);
    }

    public final com.google.common.util.concurrent.ListenableFuture<androidx.browser.trusted.TrustedWebActivityServiceConnection> connect(final android.net.Uri uri, java.util.Set<androidx.browser.trusted.Token> set, java.util.concurrent.Executor executor) {
        final androidx.browser.trusted.ConnectionHolder connectionHolder = this.getHighSpeedVideoFpsRangesFor.get(uri);
        if (connectionHolder == null) {
            android.content.Intent highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, uri, set, true);
            if (highSpeedVideoFpsRangesFor == null) {
                return androidx.browser.trusted.FutureUtils.getHighSpeedVideoSizes(new java.lang.IllegalArgumentException("No service exists for scope"));
            }
            final androidx.browser.trusted.ConnectionHolder connectionHolder2 = new androidx.browser.trusted.ConnectionHolder(new java.lang.Runnable() { // from class: androidx.browser.trusted.TrustedWebActivityServiceConnectionPool$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.browser.trusted.TrustedWebActivityServiceConnectionPool trustedWebActivityServiceConnectionPool = androidx.browser.trusted.TrustedWebActivityServiceConnectionPool.this;
                    trustedWebActivityServiceConnectionPool.getHighSpeedVideoFpsRangesFor.remove(uri);
                }
            });
            this.getHighSpeedVideoFpsRangesFor.put(uri, connectionHolder2);
            new androidx.browser.trusted.TrustedWebActivityServiceConnectionPool.BindToServiceAsyncTask(this.Camera2StreamConfigurationMap, highSpeedVideoFpsRangesFor, connectionHolder2).executeOnExecutor(executor, new java.lang.Void[0]);
            return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.browser.trusted.ConnectionHolder$$ExternalSyntheticLambda0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    androidx.browser.trusted.ConnectionHolder connectionHolder3 = androidx.browser.trusted.ConnectionHolder.this;
                    int i = connectionHolder3.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        connectionHolder3.getHighSpeedVideoFpsRanges.add(completer);
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                throw new java.lang.IllegalStateException("Service has been disconnected.");
                            }
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("Connection state is invalid");
                            }
                            throw connectionHolder3.getHighSpeedVideoFpsRangesFor;
                        }
                        androidx.browser.trusted.TrustedWebActivityServiceConnection trustedWebActivityServiceConnection = connectionHolder3.getHighResolutionOutputSizeshNQ4ISI;
                        if (trustedWebActivityServiceConnection == null) {
                            throw new java.lang.IllegalStateException("ConnectionHolder state is incorrect.");
                        }
                        completer.set(trustedWebActivityServiceConnection);
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionHolder, state = ");
                    sb.append(connectionHolder3.Camera2StreamConfigurationMap);
                    return sb.toString();
                }
            });
        }
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.browser.trusted.ConnectionHolder$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                androidx.browser.trusted.ConnectionHolder connectionHolder3 = androidx.browser.trusted.ConnectionHolder.this;
                int i = connectionHolder3.Camera2StreamConfigurationMap;
                if (i == 0) {
                    connectionHolder3.getHighSpeedVideoFpsRanges.add(completer);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            throw new java.lang.IllegalStateException("Service has been disconnected.");
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("Connection state is invalid");
                        }
                        throw connectionHolder3.getHighSpeedVideoFpsRangesFor;
                    }
                    androidx.browser.trusted.TrustedWebActivityServiceConnection trustedWebActivityServiceConnection = connectionHolder3.getHighResolutionOutputSizeshNQ4ISI;
                    if (trustedWebActivityServiceConnection == null) {
                        throw new java.lang.IllegalStateException("ConnectionHolder state is incorrect.");
                    }
                    completer.set(trustedWebActivityServiceConnection);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionHolder, state = ");
                sb.append(connectionHolder3.Camera2StreamConfigurationMap);
                return sb.toString();
            }
        });
    }

    static class BindToServiceAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Exception> {
        private final android.content.Context getHighSpeedVideoFpsRanges;
        private final android.content.Intent getHighSpeedVideoFpsRangesFor;
        private final androidx.browser.trusted.ConnectionHolder getHighSpeedVideoSizes;

        @Override // android.os.AsyncTask
        protected /* synthetic */ java.lang.Exception doInBackground(java.lang.Void[] voidArr) {
            return getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ void onPostExecute(java.lang.Exception exc) {
            java.lang.Exception exc2 = exc;
            if (exc2 != null) {
                androidx.browser.trusted.ConnectionHolder connectionHolder = this.getHighSpeedVideoSizes;
                java.util.Iterator<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> it = connectionHolder.getHighSpeedVideoFpsRanges.iterator();
                while (it.hasNext()) {
                    it.next().setException(exc2);
                }
                connectionHolder.getHighSpeedVideoFpsRanges.clear();
                connectionHolder.getHighSpeedVideoSizes.run();
                connectionHolder.Camera2StreamConfigurationMap = 3;
                connectionHolder.getHighSpeedVideoFpsRangesFor = exc2;
            }
        }

        BindToServiceAsyncTask(android.content.Context context, android.content.Intent intent, androidx.browser.trusted.ConnectionHolder connectionHolder) {
            this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
            this.getHighSpeedVideoFpsRangesFor = intent;
            this.getHighSpeedVideoSizes = connectionHolder;
        }

        private java.lang.Exception getHighResolutionOutputSizeshNQ4ISI() {
            try {
                if (this.getHighSpeedVideoFpsRanges.bindService(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN)) {
                    return null;
                }
                this.getHighSpeedVideoFpsRanges.unbindService(this.getHighSpeedVideoSizes);
                return new java.lang.IllegalStateException("Could not bind to the service");
            } catch (java.lang.SecurityException e) {
                return e;
            }
        }
    }

    public final boolean serviceExistsForScope(android.net.Uri uri, java.util.Set<androidx.browser.trusted.Token> set) {
        return (this.getHighSpeedVideoFpsRangesFor.get(uri) == null && getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, uri, set, false) == null) ? false : true;
    }

    private static android.content.Intent getHighSpeedVideoFpsRangesFor(android.content.Context context, android.net.Uri uri, java.util.Set<androidx.browser.trusted.Token> set, boolean z) {
        if (set == null || set.size() == 0) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        java.util.Iterator<android.content.pm.ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 131072).iterator();
        java.lang.String str = null;
        while (it.hasNext()) {
            java.lang.String str2 = it.next().activityInfo.packageName;
            java.util.Iterator<androidx.browser.trusted.Token> it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().matches(str2, context.getPackageManager())) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            return null;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setPackage(str);
        intent2.setAction(androidx.browser.trusted.TrustedWebActivityService.ACTION_TRUSTED_WEB_ACTIVITY_SERVICE);
        android.content.pm.ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveService == null) {
            return null;
        }
        if (z) {
            java.lang.String str3 = resolveService.serviceInfo.name;
        }
        android.content.Intent intent3 = new android.content.Intent();
        intent3.setComponent(new android.content.ComponentName(str, resolveService.serviceInfo.name));
        return intent3;
    }
}
