package com.squareup.picasso;

/* loaded from: classes5.dex */
class PicassoExecutorService extends java.util.concurrent.ThreadPoolExecutor {
    private static final int DEFAULT_THREAD_COUNT = 3;

    PicassoExecutorService() {
        super(3, 3, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.PriorityBlockingQueue(), new com.squareup.picasso.Utils.PicassoThreadFactory());
    }

    void adjustThreadCount(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            setThreadCount(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                setThreadCount(4);
                return;
            } else {
                setThreadCount(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                setThreadCount(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        setThreadCount(3);
                        break;
                    default:
                        setThreadCount(3);
                        break;
                }
                return;
        }
        setThreadCount(2);
    }

    private void setThreadCount(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        com.squareup.picasso.PicassoExecutorService.PicassoFutureTask picassoFutureTask = new com.squareup.picasso.PicassoExecutorService.PicassoFutureTask((com.squareup.picasso.BitmapHunter) runnable);
        execute(picassoFutureTask);
        return picassoFutureTask;
    }

    private static final class PicassoFutureTask extends java.util.concurrent.FutureTask<com.squareup.picasso.BitmapHunter> implements java.lang.Comparable<com.squareup.picasso.PicassoExecutorService.PicassoFutureTask> {
        private final com.squareup.picasso.BitmapHunter hunter;

        PicassoFutureTask(com.squareup.picasso.BitmapHunter bitmapHunter) {
            super(bitmapHunter, null);
            this.hunter = bitmapHunter;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.squareup.picasso.PicassoExecutorService.PicassoFutureTask picassoFutureTask) {
            com.squareup.picasso.Picasso.Priority priority = this.hunter.getPriority();
            com.squareup.picasso.Picasso.Priority priority2 = picassoFutureTask.hunter.getPriority();
            return priority == priority2 ? this.hunter.sequence - picassoFutureTask.hunter.sequence : priority2.ordinal() - priority.ordinal();
        }
    }
}
