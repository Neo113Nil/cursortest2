package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public final class Uninterruptibles {
    public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch countDownLatch) {
        boolean z = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch countDownLatch, java.time.Duration duration) {
        return awaitUninterruptibly(countDownLatch, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch countDownLatch, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long j2 = nanos;
            while (true) {
                try {
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (java.lang.System.nanoTime() + nanos) - java.lang.System.nanoTime();
                }
            }
            return countDownLatch.await(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.locks.Condition condition, java.time.Duration duration) {
        return awaitUninterruptibly(condition, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.locks.Condition condition, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long j2 = nanos;
            while (true) {
                try {
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (java.lang.System.nanoTime() + nanos) - java.lang.System.nanoTime();
                }
            }
            return condition.await(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public static void joinUninterruptibly(java.lang.Thread thread) {
        boolean z = false;
        while (true) {
            try {
                thread.join();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static void joinUninterruptibly(java.lang.Thread thread, java.time.Duration duration) {
        joinUninterruptibly(thread, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static void joinUninterruptibly(java.lang.Thread thread, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.base.Preconditions.checkNotNull(thread);
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long nanoTime = java.lang.System.nanoTime();
            long j2 = nanos;
            while (true) {
                try {
                    java.util.concurrent.TimeUnit.NANOSECONDS.timedJoin(thread, j2);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (nanoTime + nanos) - java.lang.System.nanoTime();
                }
            }
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return v;
    }

    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> future, java.time.Duration duration) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return (V) getUninterruptibly(future, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> future, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long j2 = nanos;
            while (true) {
                try {
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (java.lang.System.nanoTime() + nanos) - java.lang.System.nanoTime();
                }
            }
            return future.get(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public static <E> E takeUninterruptibly(java.util.concurrent.BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return take;
    }

    public static <E> void putUninterruptibly(java.util.concurrent.BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static void sleepUninterruptibly(java.time.Duration duration) {
        sleepUninterruptibly(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static void sleepUninterruptibly(long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long nanoTime = java.lang.System.nanoTime();
            long j2 = nanos;
            while (true) {
                try {
                    java.util.concurrent.TimeUnit.NANOSECONDS.sleep(j2);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (nanoTime + nanos) - java.lang.System.nanoTime();
                }
            }
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, java.time.Duration duration) {
        return tryAcquireUninterruptibly(semaphore, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, long j, java.util.concurrent.TimeUnit timeUnit) {
        return tryAcquireUninterruptibly(semaphore, 1, j, timeUnit);
    }

    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, int i, java.time.Duration duration) {
        return tryAcquireUninterruptibly(semaphore, i, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long j2 = nanos;
            while (true) {
                try {
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (java.lang.System.nanoTime() + nanos) - java.lang.System.nanoTime();
                }
            }
            return semaphore.tryAcquire(i, j2, java.util.concurrent.TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean tryLockUninterruptibly(java.util.concurrent.locks.Lock lock, java.time.Duration duration) {
        return tryLockUninterruptibly(lock, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static boolean tryLockUninterruptibly(java.util.concurrent.locks.Lock lock, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long j2 = nanos;
            while (true) {
                try {
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (java.lang.System.nanoTime() + nanos) - java.lang.System.nanoTime();
                }
            }
            return lock.tryLock(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public static void awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService executorService) {
        com.google.common.base.Verify.verify(awaitTerminationUninterruptibly(executorService, Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS));
    }

    public static boolean awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService executorService, java.time.Duration duration) {
        return awaitTerminationUninterruptibly(executorService, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static boolean awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService executorService, long j, java.util.concurrent.TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long j2 = nanos;
            while (true) {
                try {
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    j2 = (java.lang.System.nanoTime() + nanos) - java.lang.System.nanoTime();
                }
            }
            return executorService.awaitTermination(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    private Uninterruptibles() {
    }
}
