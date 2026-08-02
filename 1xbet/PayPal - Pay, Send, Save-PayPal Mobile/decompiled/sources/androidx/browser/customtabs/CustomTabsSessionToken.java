package androidx.browser.customtabs;

/* loaded from: classes6.dex */
public class CustomTabsSessionToken {
    private final androidx.browser.customtabs.CustomTabsCallback Camera2StreamConfigurationMap;
    private final android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI;
    final android.support.customtabs.ICustomTabsCallback getHighSpeedVideoFpsRangesFor;

    static class MockCallback extends android.support.customtabs.ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(java.lang.String str, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i, int i2, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(java.lang.String str, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(android.os.Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(android.os.Bundle bundle) {
        }

        MockCallback() {
        }
    }

    public static androidx.browser.customtabs.CustomTabsSessionToken getSessionTokenFromIntent(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        android.os.IBinder binder = extras.getBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new androidx.browser.customtabs.CustomTabsSessionToken(binder != null ? android.support.customtabs.ICustomTabsCallback.Stub.asInterface(binder) : null, pendingIntent);
    }

    public static androidx.browser.customtabs.CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new androidx.browser.customtabs.CustomTabsSessionToken(new androidx.browser.customtabs.CustomTabsSessionToken.MockCallback(), null);
    }

    CustomTabsSessionToken(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.app.PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new java.lang.IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.getHighSpeedVideoFpsRangesFor = iCustomTabsCallback;
        this.getHighResolutionOutputSizeshNQ4ISI = pendingIntent;
        this.Camera2StreamConfigurationMap = iCustomTabsCallback == null ? null : new androidx.browser.customtabs.CustomTabsCallback() { // from class: androidx.browser.customtabs.CustomTabsSessionToken.1
            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onNavigationEvent(int i, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onNavigationEvent(i, bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void extraCallback(java.lang.String str, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.extraCallback(str, bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) {
                try {
                    return androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.extraCallbackWithResult(str, bundle);
                } catch (android.os.RemoteException unused) {
                    return null;
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onMessageChannelReady(android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onMessageChannelReady(bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onPostMessage(java.lang.String str, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onPostMessage(str, bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onRelationshipValidationResult(i, uri, z, bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onActivityResized(int i, int i2, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onActivityResized(i, i2, bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onWarmupCompleted(android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onWarmupCompleted(bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onActivityLayout(i, i2, i3, i4, i5, bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onMinimized(android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onMinimized(bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.customtabs.CustomTabsCallback
            public void onUnminimized(android.os.Bundle bundle) {
                try {
                    androidx.browser.customtabs.CustomTabsSessionToken.this.getHighSpeedVideoFpsRangesFor.onUnminimized(bundle);
                } catch (android.os.RemoteException unused) {
                }
            }
        };
    }

    public boolean hasCallback() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public boolean hasId() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public int hashCode() {
        android.app.PendingIntent pendingIntent = this.getHighResolutionOutputSizeshNQ4ISI;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        android.support.customtabs.ICustomTabsCallback iCustomTabsCallback = this.getHighSpeedVideoFpsRangesFor;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder().hashCode();
        }
        throw new java.lang.IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.browser.customtabs.CustomTabsSessionToken)) {
            return false;
        }
        androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken = (androidx.browser.customtabs.CustomTabsSessionToken) obj;
        android.app.PendingIntent pendingIntent = customTabsSessionToken.getHighResolutionOutputSizeshNQ4ISI;
        android.app.PendingIntent pendingIntent2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if ((pendingIntent2 == null) != (pendingIntent == null)) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        android.support.customtabs.ICustomTabsCallback iCustomTabsCallback = this.getHighSpeedVideoFpsRangesFor;
        if (iCustomTabsCallback == null) {
            throw new java.lang.IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
        }
        android.os.IBinder asBinder = iCustomTabsCallback.asBinder();
        android.support.customtabs.ICustomTabsCallback iCustomTabsCallback2 = customTabsSessionToken.getHighSpeedVideoFpsRangesFor;
        if (iCustomTabsCallback2 != null) {
            return asBinder.equals(iCustomTabsCallback2.asBinder());
        }
        throw new java.lang.IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public androidx.browser.customtabs.CustomTabsCallback getCallback() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isAssociatedWith(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
        return customTabsSession.getHighSpeedVideoFpsRanges.asBinder().equals(this.getHighSpeedVideoFpsRangesFor);
    }
}
