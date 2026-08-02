package com.knotapi.knot.services;

/* loaded from: classes9.dex */
public class ErrorReporter {
    private static final java.util.Map<java.lang.String, java.util.List<java.lang.String>> breadcrumbStorage = new java.util.concurrent.ConcurrentHashMap();
    private static volatile com.knotapi.knot.interfaces.ErrorReporterDelegate globalErrorDelegate = null;

    public static void addBreadcrumb(java.lang.String str, java.lang.String str2) {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = breadcrumbStorage;
            synchronized (map) {
                java.util.List<java.lang.String> list = map.get("global");
                if (list == null) {
                    list = new java.util.ArrayList<>();
                    map.put("global", list);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(java.lang.String.valueOf(currentTimeMillis));
                sb.append(" - ");
                sb.append(str);
                sb.append(" [");
                sb.append(str2);
                sb.append("]");
                list.add(sb.toString());
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private static void clearStoredBreadcrumbs(java.lang.String str) {
        try {
            breadcrumbStorage.remove(str);
        } catch (java.lang.Exception unused) {
        }
    }

    private static java.lang.String getStoredBreadcrumbs(java.lang.String str) {
        try {
            java.util.List<java.lang.String> list = breadcrumbStorage.get(str);
            if (list == null || list.isEmpty()) {
                return "";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\n\nBreadcrumbs:\n");
            for (java.lang.String str2 : list) {
                sb.append("- ");
                sb.append(str2);
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            }
            return sb.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static void registerErrorDelegate(com.knotapi.knot.interfaces.ErrorReporterDelegate errorReporterDelegate) {
        globalErrorDelegate = errorReporterDelegate;
    }

    public static void report(java.lang.Exception exc, java.lang.String str) {
        try {
            com.knotapi.knot.interfaces.ErrorReporterDelegate errorReporterDelegate = globalErrorDelegate;
            if (errorReporterDelegate != null) {
                errorReporterDelegate.sendErrorToWebApp(exc, str);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static void reportWithBreadcrumbs(java.lang.Exception exc, java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String storedBreadcrumbs = getStoredBreadcrumbs(str2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(storedBreadcrumbs);
            report(exc, sb.toString());
            clearStoredBreadcrumbs(str2);
        } catch (java.lang.Exception unused) {
        }
    }

    public static void storeBreadcrumb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = breadcrumbStorage;
            synchronized (map) {
                java.util.List<java.lang.String> list = map.get(str);
                if (list == null) {
                    list = new java.util.ArrayList<>();
                    map.put(str, list);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(java.lang.String.valueOf(currentTimeMillis));
                sb.append(" - ");
                sb.append(str2);
                sb.append(" [");
                sb.append(str3);
                sb.append("]");
                list.add(sb.toString());
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
